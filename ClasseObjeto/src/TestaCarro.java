public class TestaCarro {
    public static void main(String[] args){
        // instanciar objeto obj1
        Carro obj1 = new Carro("Fiat", "Uno", 0, false);
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.acelerar(100);
        obj1.frear(40);
        System.out.println(obj1.toString());
        // instanciar objeto obj2
        Carro obj2 = new Carro("GM", "Onix", 0, false);
        System.out.println(obj2.toString());
        obj2.ligar();
        obj2.acelerar(80);
        obj2.frear(60);
        obj2.frear(40);
        System.out.println(obj2.toString());

        // ao encerrar ...
        obj1.desligar();
        obj2.desligar();
    }
}
