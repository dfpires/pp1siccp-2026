public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    // Método Construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0f; // Inicia zerada
        this.status = true; // Inicia ativa
    }



    // Métodos de Comportamento
    public void depositar(float valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Não é possível depositar em uma conta encerrada.");
        }
    }

    public void sacar(float valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado.");
            } else {
                System.out.println("Erro: Saldo insuficiente para o saque de R$ " + valor);
            }
        } else {
            System.out.println("Erro: Conta inativa.");
        }
    }

    public void encerrarConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Erro: Retire o saldo de R$ " + this.saldo + " antes de encerrar.");
        }
    }

    public String toString() {
        return "--- Dados da Conta ---\n" +
                "Cliente: " + this.nomeCliente + "\n" +
                "Agência: " + this.agencia + " | Conta: " + this.numeroConta + "\n" +
                "Saldo: R$ " + this.saldo + "\n" +
                "Status: " + (this.status ? "Ativa" : "Encerrada") + "\n";
    }
}