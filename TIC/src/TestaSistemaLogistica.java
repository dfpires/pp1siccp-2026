public class TestaSistemaLogistica {
    public static void main(String[] args) {
        // 1. Criar a Empresa
        EmpresaLogistica transportadora = new EmpresaLogistica("Expresso Franca");

        // 2. Criar Veículos (Objetos independentes - Agregação)
        Caminhao c1 = new Caminhao("ABC-1234", 15.0, 3);
        Caminhao c2 = new Caminhao("XYZ-9876", 25.0, 5);
        Van v1 = new Van("VAN-1111", 1.5, true);
        Van v2 = new Van("VAN-2222", 2.0, false);

        // 3. Adicionar à frota
        transportadora.adicionarVeiculo(c1);
        transportadora.adicionarVeiculo(c2);
        transportadora.adicionarVeiculo(v1);
        transportadora.adicionarVeiculo(v2);

        // 4. Gerar Relatório Polimórfico
        transportadora.gerarRelatorioCustos(300.0);
    }
}
