package exe1;

public class Local {
    private String nomeEspaco;
    private int capacidade;

    public Local(String nomeEspaco, int capacidade) {
        this.nomeEspaco = nomeEspaco;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return nomeEspaco + " (Capacidade: " + capacidade + ")";
    }
}