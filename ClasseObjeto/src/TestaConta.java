public class TestaConta {
    public static void main(String[] args) {
        // 1. Instância c1
        Conta c1 = new Conta(101, 1, "João Silva");
        c1.depositar(500.0f);
        c1.sacar(200.0f);
        System.out.println(c1.toString());

        // 2. Instância c2
        Conta c2 = new Conta(202, 1, "Maria Souza");
        c2.sacar(50.0f); // Tentativa de saque sem saldo
        System.out.println(c2.toString());

        // 3. Teste de Encerramento em c1
        System.out.println("Tentando encerrar c1 com saldo...");
        c1.encerrarConta(); // Deve falhar pois tem 300 reais

        System.out.println("\nZerando saldo de c1 e encerrando...");
        c1.sacar(300.0f);
        c1.encerrarConta(); // Agora deve funcionar

        System.out.println(c1.toString());
    }
}