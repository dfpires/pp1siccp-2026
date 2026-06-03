package dc.unifacef.produtos_relacionamento.controller;

import dc.unifacef.produtos_relacionamento.model.ProdutoVirtual;
import dc.unifacef.produtos_relacionamento.service.ProdutoVirtualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos/virtuais")
public class ProdutoVirtualController {

    private final ProdutoVirtualService service;

    public ProdutoVirtualController(ProdutoVirtualService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoVirtual>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoVirtual> buscar(@PathVariable Long id) {
        return service.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProdutoVirtual> salvar(@RequestBody ProdutoVirtual produto) {
        ProdutoVirtual salvo = service.salvar(produto);
        URI uri = URI.create("/produtos/virtuais/" + salvo.getId());
        return ResponseEntity.created(uri).body(salvo);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProdutoVirtual> atualizar(@PathVariable Long id,
                                                    @RequestBody ProdutoVirtual atual) {
        ProdutoVirtual atualizado = service.atualizar(id, atual);
        if (atualizado == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (!service.remover(id)) return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
