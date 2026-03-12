import java.util.Date;

public class TestaTodoParte {
    public static void main(String args[]){

        // cria um objeto da classe Cliente independente
        // cria o objeto-parte
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "1234", "Rua Chile");

        // cria o objeto-todo
        Pedido ped1 = new Pedido(10, new Date(), cl2);
        System.out.println(ped1.toString());
    }
}
