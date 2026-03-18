package exe1;

public class Aluno {
    private int id;
    private String nome, ra, curso;

    public Aluno(int id, String nome, String ra, String curso) {
        this.id = id;
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    // Getters e Setters aqui...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\n    Aluno [ID=" + id + ", Nome=" + nome + ", RA=" + ra + "]";
    }
}