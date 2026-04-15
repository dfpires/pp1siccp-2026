public abstract class Veiculo {
    protected String placa;
    protected double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa + " | Capacidade: " + capacidadeCarga + "t");
    }

    // Método abstrato: define a assinatura, mas não o comportamento
    public abstract double calcularCustoViagem(double distancia);
}