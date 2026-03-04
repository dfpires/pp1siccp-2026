public class Carro{
    // variáveis ou propriedade ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo de dado primitivo
    public boolean motor; // boolean é um tipo de dado primitivo
    // método construtor - tem o mesmo nome da classe
    public Carro(String marca, String modelo, float velocidade, boolean motor){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor ligado");
        }
    }
    // acelerar o carro de x
    public void acelerar(float x){
        if (this.motor){
            this.velocidade += x;
            System.out.println("Nova velocidade " + this.velocidade);
        }
    }
    public void frear(float x){
        if (this.motor && this.velocidade - x >= 0){
            this.velocidade -= x;
            System.out.println("Nova velocidade " + this.velocidade);
        }
        else System.out.println("Não freou");
    }
    // desligar o carro
    public void desligar(){
        if (this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Motor desligado");
        }
    }
    // método que converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }
}