package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "Fulano");


        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Voo vo1 = new Voo(777, "Ribeirão Preto", "Brasilia", data);

        Reserva re1 = new Reserva(912, LocalDateTime.now(), 10, pas1, vo1);
        System.out.println(re1.toString());

        // usando o objeto re1, exiba o destino do vôo da reserva
        System.out.println(re1.getVoo().getDestino());
        // usando o objeto re1, exiba o nome do passageiro da reserva
        System.out.println(re1.getPassageiro().getNome());

    }
}
