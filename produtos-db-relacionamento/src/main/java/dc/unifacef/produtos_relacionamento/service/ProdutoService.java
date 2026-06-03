package dc.unifacef.produtos_relacionamento.service;

import dc.unifacef.produtos_relacionamento.model.Produto;
import dc.unifacef.produtos_relacionamento.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repo;
    // injeção de dependência ocorre pelo construtor
    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }
    // listar os produtos
    public List<Produto> listar(){
        return repo.findAll();
    }
    // buscar por id
    public Optional<Produto> buscar(Long id){
        return repo.findById(id);
    }
    @Transactional
    public Produto salvar(Produto p){
        return repo.save(p); // objeto p sem id
    }
    @Transactional
    public boolean remover(Long id){
        if (repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
    @Transactional
    public Produto atualizar(Long id, Produto atual){
        if (repo.existsById(id)){
            atual.setId(id);
            return repo.save(atual); // achou
        }
        return null; // não achou para atualizar
    }
}
