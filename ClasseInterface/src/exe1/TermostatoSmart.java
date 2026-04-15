package exe1;
public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura{
    private boolean ativo = false;
    @Override
    public void ligar() {
        this.ativo = true;
        System.out.println("Termostato ativado");
    }
    @Override
    public void desligar() {
        this.ativo = false;
        System.out.println("Termostato desativado");
    }

    @Override
    public double lerTemperatura() {
        return 22.5; // simulação de leitura
    }
}
