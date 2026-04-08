import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }
    public static void main(String[] args){
        Junior jr1 =
       new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);

        Pleno pl1 =
       new Pleno("Beltrano", "Java", 6000, 5);
        exibir(pl1);

        Senior sr1 =
       new Senior("Ciclano", "Java", 8000, 2000);
        exibir(sr1);

        // vetor de devs
        ArrayList<Desenvolvedor> devs = new ArrayList<Desenvolvedor>();
        // adicionando devs no vetor
        devs.add(jr1);
        devs.add(pl1);
        devs.add(sr1);
        // percorre o vetor
        for(Desenvolvedor dev: devs){
            exibir(dev);
        }


    }
}
