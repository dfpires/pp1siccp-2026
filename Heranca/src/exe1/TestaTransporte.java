package exe1;
public class TestaTransporte {
    public static void exibe(Veiculo camaleao){
        // referencia = ce1;
        camaleao.mover();      // Polimorfismo:
        camaleao.abastecer();  // Polimorfismo:
    }
    public static void main(String[] args) {
        // Fazendo a variável apontar para um objeto FILHO (Aviao)
        System.out.println("--- Testando Avião ---");
        Aviao av1 = new Aviao("Boeing", "747", 900.0f, 11000.0f);
        exibe(av1);
        System.out.println("\n--- Testando Carro Elétrico ---");
        // Mudando a mesma variável para apontar para outro objeto FILHO (CarroEletrico)
        CarroEletrico ce1 = new CarroEletrico("Tesla", "Model S", 120.0f, 600);
        exibe(ce1);

    }
}
