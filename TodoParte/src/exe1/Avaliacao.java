package exe1;

import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    // Método de Composição: Cria o objeto Questao internamente
    public void adicionarQuestao(int num, String texto, float peso) {
        this.questoes.add(new Questao(num, texto, peso));
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "\n  Avaliação: " + nome + " | Questões: " + questoes;
    }
}
