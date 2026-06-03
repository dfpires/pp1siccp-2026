package dc.unifacef.produtos_relacionamento.service;

import dc.unifacef.produtos_relacionamento.model.ProdutoVirtual;
import dc.unifacef.produtos_relacionamento.repository.ProdutoVirtualRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoVirtualService {

    private final ProdutoVirtualRepository repo;

    public ProdutoVirtualService(ProdutoVirtualRepository repo) {
        this.repo = repo;
    }

    public List<ProdutoVirtual> listar() {
        return repo.findAll();
    }

    public Optional<ProdutoVirtual> buscar(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public ProdutoVirtual salvar(ProdutoVirtual p) {
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
    public ProdutoVirtual atualizar(Long id, ProdutoVirtual atual) {
        if (repo.existsById(id)) {
            atual.setId(id);
            return repo.save(atual);
        }
        return null;
    }
}
