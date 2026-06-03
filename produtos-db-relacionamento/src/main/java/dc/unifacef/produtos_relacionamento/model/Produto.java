package dc.unifacef.produtos_relacionamento.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
// Define a estratégia de herança: tabela pai + tabelas filhas com JOIN
@Inheritance(strategy = InheritanceType.JOINED)
// Coluna discriminadora identifica o tipo concreto de cada linha
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Double preco;
    @Column(length = 500)
    private String descricao;

    // Lado "muitos": muitos Produtos pertencem a uma Categoria
    // @JoinColumn define o nome da coluna FK na tabela produtos
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties("produtos") // evita recursão infinita na serialização JSON
    private Categoria categoria;

    public Produto() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
