package prova;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected String nome;
    protected String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public abstract String emitirSom();

    @Override
    public String toString() {
        return "Nome: " + nome + " | Espécie: " + especie + " | Som: " + emitirSom();
    }
}

// Subclasse Mamifero
class Mamifero extends Animal {
    private String pelagem;

    public Mamifero(String nome, String especie, String pelagem) {
        super(nome, especie);
        this.pelagem = pelagem;
    }

    @Override
    public String emitirSom() {
        return "Mamífero emitindo som característico";
    }
}

// Subclasse Ave
class Ave extends Animal {
    private double envergaduraAsa;

    public Ave(String nome, String especie, double envergaduraAsa) {
        super(nome, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public String emitirSom() {
        return "Ave cantando ou piando";
    }
}

import java.util.ArrayList;
import java.util.List;

public class Recinto {
    private String nomeRecinto;
    private List<Animal> animais;

    public Recinto(String nomeRecinto) {
        this.nomeRecinto = nomeRecinto;
        this.animais = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void exibirAnimais() {
        System.out.println("--- Lista de Animais no Recinto: " + nomeRecinto + " ---");
        for (Animal a : animais) {
            // Chamada polimórfica ao método toString()
            System.out.println(a.toString());
        }
    }

    public void resumo() {
        System.out.println("Recinto: " + nomeRecinto);
        System.out.println("Quantidade total de animais: " + animais.size());
    }
}

public class TestaRecinto {
    public static void main(String[] args) {
        // Criando o Recinto
        Recinto savana = new Recinto("Savana Africana");

        // Criando instâncias das subclasses (Polimorfismo)
        Animal leao = new Mamifero("Simba", "Leão", "Densa");
        Animal zebra = new Mamifero("Marty", "Zebra", "Curta");
        Animal aguia = new Ave("Vitória", "Águia-real", 2.1);

        // Adicionando animais ao recinto (Agregação)
        savana.addAnimal(leao);
        savana.addAnimal(zebra);
        savana.addAnimal(aguia);

        // Chamada dos métodos solicitados
        savana.resumo();
        System.out.println();
        savana.exibirAnimais();
    }
}
