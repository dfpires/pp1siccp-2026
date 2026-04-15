package exe1;

public abstract class Participante implements Certificavel {
    protected String nome;
    protected String email;

    public Participante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public abstract double calcularTaxaInscricao();

    public String getNome() {
        return nome;
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certificado padrão gerado para: " + nome);
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
