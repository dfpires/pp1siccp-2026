package exe3;

public class TestaPlacar {
    public static void main(String[] args) {
        // Instanciando o placar
        Placar jogo = new Placar("Sesi Franca", "Bauru");

        System.out.println("--- Início de Jogo ---");
        System.out.println(jogo.toString());

        // Simulando pontuações
        jogo.registrarPonto("casa", 3);       // Cesta de 3 do Franca
        jogo.registrarPonto("visitante", 2);  // Cesta de 2 do Bauru
        jogo.registrarPonto("casa", 1);       // Lance livre do Franca

        // Avançando o jogo
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto(); // Chegamos ao 4º Quarto

        jogo.registrarPonto("casa", 2);

        System.out.println("\n--- Placar Final ---");
        System.out.println(jogo.toString());

        // Tentando avançar após o fim
        jogo.proximoQuarto();
    }
}
