package exe1;

public class Professor extends Participante {
    private String titulacao;

    public Professor(String nome, String email, String titulacao) {
        super(nome, email);
        this.titulacao = titulacao;
    }

    @Override
    public double calcularTaxaInscricao() {
        return 100.00; // Taxa para professor
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certificado de Palestrante (" + titulacao + ") gerado para: " + nome);
    }

    @Override
    public String toString() {
        return "Professor{" +
                super.toString() +
                "titulacao='" + titulacao + '\'' +
                '}';
    }
}
