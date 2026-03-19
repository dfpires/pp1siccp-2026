package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// objeto-parte
public class Voo {
    private int nro;
    private String origem, destino;
    private LocalDateTime data;

    public Voo() {
    }

    public Voo(int nro, String origem, String destino, LocalDateTime data) {
        this.nro = nro;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Voo{" +
                "nro=" + this.nro +
                ", origem='" + this.origem + '\'' +
                ", destino='" + this.destino + '\'' +
                ", data=" + this.data.format(formatoBR) +
                '}';
    }
}
