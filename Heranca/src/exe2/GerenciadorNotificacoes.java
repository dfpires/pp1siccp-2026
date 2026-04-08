package exe2;

import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main(String[] args){
        // criação de um vetor (array) contendo canais de notificação
        ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();
        // adiciona as notificações no vetor
        canais.add(
    new Email("Carlos", "Venha tomar vacina", "Lembrete")
        );
        canais.add(
    new Sms("Carlos", "Venha tomar vacina", 999999999)
        );
        canais.add(
    new WhatsApp("Carlos", "Venha tomar vacina", "Não lida")
        );
        // percorre o vetor chamando o método enviar
        for(CanalNotificacao camaleao: canais){ // para cada canal
            camaleao.enviar(); // polimorfismo
        }
    }
}
