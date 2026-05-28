package dc.unifacef.bd.controller;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController // ele recebe as requisições HTTP
@RequestMapping("/produtos")
public class ProdutoController {
    // vamos usar um objeto da classe ProdutoService - injeção de dependência
    // vamos usar o construtor pra isso
    private ProdutoService service;
    public ProdutoController(ProdutoService service){

        this.service = service;
    }
    // por que usar o ResponseEntity? para retornar diferentes statusCode ao FE
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(service.listar()); // statusCode: 200
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable Long id){
        Optional<Produto> prod = service.buscarPorId(id);
        if (prod.isEmpty()){
            return ResponseEntity.notFound().build(); // statusCode - 404 - produto não existe
        }
        return ResponseEntity.ok(prod); // statusCode - 200 - retorna produto encontrado
    }
    @PostMapping
    public ResponseEntity<Produto> salva(@RequestBody Produto produto){
        Produto novo = service.salva(produto);
        if (novo != null) {
            // vamos montar uma URI - Uniform Resource Identifier
            URI uri = URI.create("/produtos/" + novo.getId());
            return ResponseEntity.created(uri).body(novo); // statusCode: 201
        }
        return ResponseEntity.noContent().build(); // statusCode: 204
    }
}
