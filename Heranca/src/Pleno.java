public class Pleno extends Desenvolvedor {
    private int projEntr; // qtde de projetos entregues

    public Pleno(){
        super();
    }
    public Pleno(String nome, String linguagem, float salarioBase, int projEntr){
        super(nome, linguagem, salarioBase);
        this.projEntr = projEntr;
    }
}
