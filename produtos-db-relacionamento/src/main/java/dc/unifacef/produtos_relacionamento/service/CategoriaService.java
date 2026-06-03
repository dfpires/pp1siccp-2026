package dc.unifacef.produtos_relacionamento.service;

import dc.unifacef.produtos_relacionamento.model.Categoria;
import dc.unifacef.produtos_relacionamento.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository repo;

    public CategoriaService(CategoriaRepository repo) {
        this.repo = repo;
    }

    public List<Categoria> listar() {
        return repo.findAll();
    }

    public Optional<Categoria> buscar(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Categoria salvar(Categoria c) {
        return repo.save(c);
    }

    @Transactional
    public boolean remover(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    @Transactional
    public Categoria atualizar(Long id, Categoria atual) {
        if (repo.existsById(id)) {
            atual.setId(id);
            return repo.save(atual);
        }
        return null;
    }
}
