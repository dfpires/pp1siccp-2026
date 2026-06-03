package dc.unifacef.produtos_relacionamento.controller;

import dc.unifacef.produtos_relacionamento.model.Produto;
import dc.unifacef.produtos_relacionamento.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;
    // injeção de dependência pelo construtor
    public ProdutoController(ProdutoService service){
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){

        return ResponseEntity.ok(service.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscar(@PathVariable Long id){
        Optional<Produto> result = service.buscar(id);
        if (result.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }
    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        Produto salvo = service.salvar(produto);
        URI uri = URI.create("/produtos/" + salvo.getId());
        return ResponseEntity.created(uri).body(salvo);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> remover(@PathVariable Long id){
        if (service.remover(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id,
                                  @RequestBody Produto atual){
        Produto aux = (service.atualizar(id, atual));
        if (aux == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(atual);
    }
}
