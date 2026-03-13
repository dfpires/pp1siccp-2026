import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){

        // cria um objeto da classe Cliente independente
        // cria o objeto-parte
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "1234", "Rua Chile");

        Produto pr1 = new Produto(100, "Mouse", "Mouse Óptico", 180);
        Produto pr2 = new Produto(200, "Monitor", "Widescreen", 900);
        Produto pr3 = new Produto(201, "Cooler", "Air Cooler", 300);

        // cria o objeto-todo
        Pedido ped1 = new Pedido(10, new Date(), cl2);
        ped1.adicionaItemPedido(1000, 5, pr1);
        ped1.adicionaItemPedido(201, 2, pr2);
        ped1.adicionaItemPedido(202, 4, pr3);

        System.out.println(ped1.toString());
    }
}
