package exe1;

public class TestaAcademico {
    public static void main(String[] args) {
        // 1. Instanciar Alunos independentes
        Aluno a1 = new Aluno(1, "João Silva", "2026001", "Eng. Software");
        Aluno a2 = new Aluno(2, "Maria Oliveira", "2026002", "Sist. Informação");

        // 2. Instanciar Disciplina
        Disciplina disc = new Disciplina(10, "Programação Orientada a Objetos", "Prof. Daniel");

        // 3. Agregação: Matricular alunos
        disc.matricularAluno(a1);
        disc.matricularAluno(a2);

        // 4. Composição: Criar Avaliação
        disc.criarAvaliacao(101, "Prova Semestral");

        // 5. Composição Aninhada: Adicionar questões à avaliação criada
        Avaliacao av = disc.getAvaliacao("Prova Semestral");
        if (av != null) {
            av.adicionarQuestao(1, "O que é Encapsulamento?", 3.5f);
            av.adicionarQuestao(2, "Diferencie Agregação de Composição.", 3.5f);
            av.adicionarQuestao(3, "Implemente um método toString.", 3.0f);
        }

        // 6. Imprimir resultado
        System.out.println(disc.toString());
    }
}
