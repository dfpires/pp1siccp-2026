package dc.unifacef.produtos_relacionamento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos_fisicos")
// Valor gravado na coluna "tipo" da tabela pai para este subtipo
@DiscriminatorValue("fisico")
public class ProdutoFisico extends Produto {

    // campo exclusivo deste subtipo — fica na tabela produtos_fisicos
    private Float peso;

    public ProdutoFisico() {}

    public Float getPeso() { return peso; }
    public void setPeso(Float peso) { this.peso = peso; }
}
