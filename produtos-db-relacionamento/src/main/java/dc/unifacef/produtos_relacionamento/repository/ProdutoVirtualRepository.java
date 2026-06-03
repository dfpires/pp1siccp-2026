package dc.unifacef.produtos_relacionamento.repository;

import dc.unifacef.produtos_relacionamento.model.ProdutoVirtual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoVirtualRepository extends JpaRepository<ProdutoVirtual, Long> {

    // consulta apenas produtos virtuais pelo status de pagamento
    List<ProdutoVirtual> findByUrl(String url);
}
