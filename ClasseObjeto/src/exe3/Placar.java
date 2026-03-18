package exe3;

public class Placar {
    // Atributos
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    // Construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Método para registrar pontos (com validação de time e tipo)
    public void registrarPonto(String time, int tipo) {
        // O basquete só tem pontos de 1, 2 ou 3
        if (tipo < 1 || tipo > 3) {
            System.out.println("Pontuação inválida!");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            this.pontosCasa += tipo;
            System.out.println("Cesta de " + tipo + " pontos para o " + nomeTimeCasa);
        } else if (time.equalsIgnoreCase("visitante")) {
            this.pontosVisitante += tipo;
            System.out.println("Cesta de " + tipo + " pontos para o " + nomeTimeVisitante);
        } else {
            System.out.println("Time não identificado.");
        }
    }

    // Método para avançar o tempo de jogo
    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++;
            System.out.println("Iniciando o " + this.periodoQuarto + "º Quarto!");
        } else {
            System.out.println("O jogo já terminou!");
        }
    }

    @Override
    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] " +
                nomeTimeVisitante + " - Período: " + periodoQuarto;
    }
}