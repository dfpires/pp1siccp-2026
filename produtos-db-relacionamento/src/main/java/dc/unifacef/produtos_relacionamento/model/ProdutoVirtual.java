package dc.unifacef.produtos_relacionamento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos_virtuais")
// Valor gravado na coluna "tipo" da tabela pai para este subtipo
@DiscriminatorValue("virtual")
public class ProdutoVirtual extends Produto {

    // campo exclusivo deste subtipo — fica na tabela produtos_virtuais
    private String url;

    public ProdutoVirtual() {}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
