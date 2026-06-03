package dc.unifacef.produtos_relacionamento.repository;

import dc.unifacef.produtos_relacionamento.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Categoria findByNome(String nome);
}
