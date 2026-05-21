package dc.unifacef.bd.model;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private Double preco;
    @Column (length = 500)
    private String descrico;


}
