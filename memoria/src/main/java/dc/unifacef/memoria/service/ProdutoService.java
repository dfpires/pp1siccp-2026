package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    // cria o ArrayList
    private List<Produto> produtos = new ArrayList<Produto>();
    private Long id = 1L;
    // consulta os produtos na lista
    public List<Produto> consulta(){
        return this.produtos;
    }
    // insere produto na lista
    public Produto cria(Produto produto){
        produto.setId(id);
        id++;
        this.produtos.add(produto);
        return produto;
    }
}
