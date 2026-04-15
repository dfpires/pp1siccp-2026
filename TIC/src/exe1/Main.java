package exe1;

public class Main {
    public static void main(String[] args) {
        // Criando o evento (o Local será criado internamente - Composição)
        Evento congresso = new Evento("Congresso de Tecnologia Uni-FACEF", "Auditório Principal", 200);

        // Criando participantes (Objetos independentes - Agregação posterior)
        Participante aluno1 = new Estudante("Daniel Silva", "daniel@email.com", "12345");
        Participante prof1 = new Professor("Dr. Ricardo", "ricardo@email.com", "Doutor");

        // Realizando inscrições (Criação da Classe de Associação)
        congresso.realizarInscricao(aluno1, "INS-001");
        congresso.realizarInscricao(prof1, "INS-002");

        // Exibindo o comportamento polimórfico
        congresso.exibirRelatorio();
    }
}
