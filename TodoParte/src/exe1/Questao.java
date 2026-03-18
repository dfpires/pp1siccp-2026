package exe1;

public class Questao {
    private int numero;
    private String enunciado;
    private float valor;

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    // Getters e Setters aqui...

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n      Questão " + numero + ": " + enunciado + " (Peso: " + valor + ")";
    }
}
