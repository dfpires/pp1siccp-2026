import java.util.ArrayList;

public class EmpresaLogistica {
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;

    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();
    }

    // AGREGAÇÃO: Recebe o veículo pronto (criado no main) e guarda na lista
    public void adicionarVeiculo(Veiculo v) {
        this.frota.add(v);
        System.out.println("Veículo " + v.placa + " adicionado à frota.");
    }

    public void gerarRelatorioCustos(double distancia) {
        System.out.println("\n--- Relatório de Custos: " + nomeEmpresa + " ---");
        System.out.println("Distância considerada: " + distancia + " km");

        for (Veiculo v : frota) {
            v.exibirDados();
            // POLIMORFISMO: O Java decide em tempo de execução
            // qual calcularCustoViagem chamar (Caminhão ou Van)
            double custo = v.calcularCustoViagem(distancia);
            System.out.println("Custo Estimado: R$ " + String.format("%.2f", custo));
            System.out.println("--------------------------------------");
        }
    }
}
