package exe1;

public class Estudante extends Participante {
    private String ra;

    public Estudante(String nome, String email, String ra) {
        super(nome, email);
        this.ra = ra;
    }

    @Override
    public double calcularTaxaInscricao() {
        return 50.00; // Taxa fixa para estudante
    }

    @Override
    public String toString() {
        return "Estudante{" +
                super.toString() +
                "ra='" + ra + '\'' +
                '}';
    }
}