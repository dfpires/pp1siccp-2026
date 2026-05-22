package dc.unifacef.bd.service;
import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // a injeção de dependência será pelo construtor
    private ProdutoRepository repo;
    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }
    // listar os produtos da tabela produtos
    public List<Produto> listar(){
        return repo.findAll();
    }
    // listar os produtos da tabela produtos por um id
    public Optional<Produto> buscarPorId(Long id){
        return repo.findById(id); // pode ou não retornar um produto
    }
    // remove um produto da tabela produtos
    public boolean remove(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true; // remove
        }
        return false; // não remove
    }
}
