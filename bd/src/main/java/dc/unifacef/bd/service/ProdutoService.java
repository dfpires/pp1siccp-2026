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

        return repo.findAll(); // select * from produtos
    }
    // listar os produtos da tabela produtos por um id
    public Optional<Produto> buscarPorId(Long id){
        // select * from produtos where id = id
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
    // atualiza um produto por um id e o produto alterado
    public Produto atualiza(Long id, Produto alterado){
        if (repo.existsById(id)){
            // produto existe para atualizar
            alterado.setId(id);
            return repo.save(alterado); // como alterado tem id, ele faz update
        }
        return null; // produto não existe
    }
    // cria ou insere o produto no banco
    public Produto salva(Produto produto){
        if (produto.getDescrico().equals("robo")){
            return null;
        }
        return repo.save(produto); // como produto não tem id, ele faz insert
    }
}
