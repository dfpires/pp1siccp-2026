package exe1;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // Agregação: Recebe o aluno que já existe fora
    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    // Composição: Cria a avaliação dentro da disciplina
    public void criarAvaliacao(int id, String nome) {
        this.avaliacoes.add(new Avaliacao(id, nome));
    }

    // Getter para acessar uma avaliação específica e adicionar questões nela
    public Avaliacao getAvaliacao(String nome) {
        for (Avaliacao av : avaliacoes) {
            if (av.getNome().equalsIgnoreCase(nome)) return av;
        }
        return null;
    }

    @Override
    public String toString() {
        return "DISCIPLINA: " + nome + " | Prof: " + professor +
                "\n--- Alunos Matriculados ---" + alunos +
                "\n--- Cronograma de Avaliações ---" + avaliacoes;
    }
}
