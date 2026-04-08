package exe1;

public class Aviao extends Veiculo {
    private float altitudeMax;
    public Aviao() {
        super(); // reutilização de código
    }
    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade); // reutilização de código
        this.altitudeMax = altitudeMax;
    }
    @Override
    public void mover() {
        System.out.println("Avião voando a " + this.velocidade + " km/h e " +
                this.altitudeMax + " metros de altitude.");
    }
    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação.");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                super.toString() +
                "altitudeMax=" + altitudeMax +
                '}';
    }
}
