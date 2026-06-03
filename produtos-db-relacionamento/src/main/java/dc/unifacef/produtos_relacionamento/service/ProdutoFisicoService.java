package dc.unifacef.produtos_relacionamento.service;

import dc.unifacef.produtos_relacionamento.model.ProdutoFisico;
import dc.unifacef.produtos_relacionamento.repository.ProdutoFisicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoFisicoService {

    private final ProdutoFisicoRepository repo;

    public ProdutoFisicoService(ProdutoFisicoRepository repo) {
        this.repo = repo;
    }

    public List<ProdutoFisico> listar() {
        return repo.findAll();
    }

    public Optional<ProdutoFisico> buscar(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public ProdutoFisico salvar(ProdutoFisico p) {
        return repo.save(p);
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
    public ProdutoFisico atualizar(Long id, ProdutoFisico atual) {
        if (repo.existsById(id)) {
            atual.setId(id);
            return repo.save(atual);
        }
        return null;
    }
}
