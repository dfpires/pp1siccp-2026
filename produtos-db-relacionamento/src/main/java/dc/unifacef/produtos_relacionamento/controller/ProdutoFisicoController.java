package dc.unifacef.produtos_relacionamento.controller;

import dc.unifacef.produtos_relacionamento.model.ProdutoFisico;
import dc.unifacef.produtos_relacionamento.service.ProdutoFisicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos/fisicos")
public class ProdutoFisicoController {

    private final ProdutoFisicoService service;

    public ProdutoFisicoController(ProdutoFisicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoFisico>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoFisico> buscar(@PathVariable Long id) {
        return service.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProdutoFisico> salvar(@RequestBody ProdutoFisico produto) {
        ProdutoFisico salvo = service.salvar(produto);
        URI uri = URI.create("/produtos/fisicos/" + salvo.getId());
        return ResponseEntity.created(uri).body(salvo);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProdutoFisico> atualizar(@PathVariable Long id,
                                                   @RequestBody ProdutoFisico atual) {
        ProdutoFisico atualizado = service.atualizar(id, atual);
        if (atualizado == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (!service.remover(id)) return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
