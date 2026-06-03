package dc.unifacef.produtos_relacionamento.repository;

import dc.unifacef.produtos_relacionamento.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository
        extends JpaRepository<Produto, Long> {
// aqui eu herdei: findAll, findById, save, delete, count, existsById

    // podemos também informar os métodos customizados que queremos
    List<Produto> findByNome(String nome);
    List<Produto> findByPrecoLessThan(Double max);
    List<Produto> findByNomeContaining(String termo);

    // Com @Query para JPQL customizado:
    @Query("SELECT p FROM Produto p WHERE p.preco > :min")
    List<Produto> buscarAcimaDe(@Param("min") Double min);
}
