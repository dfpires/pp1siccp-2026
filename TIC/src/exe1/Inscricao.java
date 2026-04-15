package exe1;

import java.time.LocalDateTime;

public class Inscricao {
    private String codigoInscricao;
    private LocalDateTime dataInscricao;
    private Participante participante; // A associação com o participante
    private Evento evento;

    public Inscricao(Participante participante, Evento evento, String codigoInscricao, LocalDateTime dataInscricao) {
        this.participante = participante;
        this.codigoInscricao = codigoInscricao;
        this.dataInscricao = dataInscricao;
        this.evento = evento;
    }

    public Participante getParticipante() {
        return participante;
    }

    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "codigoInscricao='" + codigoInscricao + '\'' +
                ", dataInscricao=" + dataInscricao +
                ", participante=" + participante +
                ", evento=" + evento +
                '}';
    }
}
