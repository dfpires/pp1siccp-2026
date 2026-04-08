package exe1;
public abstract class Veiculo {
    protected String marca, modelo;
    protected float velocidade;
    public Veiculo() {
    }
    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    public abstract void mover();
    public abstract void abastecer();

    // Getters e Setters podem ser adicionados aqui se desejar
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}