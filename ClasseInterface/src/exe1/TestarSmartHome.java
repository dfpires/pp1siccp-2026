package exe1;

public class TestarSmartHome {
    public static void main(String[] args){
        /* exemplo da fechadura */
        FechaduraEletronica portaEntrada = new FechaduraEletronica();
        portaEntrada.validarAcesso("1234");
        portaEntrada.ligar();
        portaEntrada.desligar();

        /* exemplo do termostato */
        TermostatoSmart ar = new TermostatoSmart();
        ar.ligar();
        System.out.println("Temperatura atual: " + ar.lerTemperatura());
        ar.desligar();
    }

}
