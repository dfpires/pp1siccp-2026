package exe1;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class Evento {
    private String titulo;
    private Local local; // COMPOSIÇÃO: o Local pertence ao Evento
    private ArrayList<Inscricao> listaInscricoes; // AGREGAÇÃO: as inscrições são reunidas aqui

    public Evento(String titulo, String nomeDoEspaco, int capacidadeEspaco) {
        this.titulo = titulo;
        // COMPOSIÇÃO: O Local é criado dentro do construtor do Evento
        this.local = new Local(nomeDoEspaco, capacidadeEspaco);
        this.listaInscricoes = new ArrayList<>();
    }

    public void realizarInscricao(Participante p, String cod) {
        // Cria a associação de composição
        Inscricao nova = new Inscricao(p, this, cod, LocalDateTime.now());
        this.listaInscricoes.add(nova);
        System.out.println("Inscrição confirmada para: " + p.getNome());
    }

    public void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO DO EVENTO: " + titulo + " ---");
        System.out.println("Local: " + local);
        System.out.println("------------------------------------------------");

        for (Inscricao i : listaInscricoes) {
            Participante p = i.getParticipante();
            // POLIMORFISMO: decide qual calcularTaxaInscricao e gerarCertificado chamar em tempo de execução
            System.out.print("Cód: " + i.getCodigoInscricao() + " | Nome: " + p.getNome());
            System.out.println(" | Taxa: R$ " + String.format("%.2f", p.calcularTaxaInscricao()));
            p.gerarCertificado(); // polimorfismo
            System.out.println("------------------------------------------------");
        }
    }
}

