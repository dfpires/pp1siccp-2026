package dc.unifacef.produtos_relacionamento.controller;

import dc.unifacef.produtos_relacionamento.model.Categoria;
import dc.unifacef.produtos_relacionamento.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Categoria> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscar(@PathVariable Long id) {
        return service.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria) {
        Categoria salva = service.salvar(categoria);
        return ResponseEntity.created(URI.create("/categorias/" + salva.getId())).body(salva);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria atualizada = service.atualizar(id, categoria);
        if (atualizada == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(atualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (!service.remover(id)) return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
