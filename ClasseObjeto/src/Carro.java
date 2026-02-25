public class Carro{
    // variáveis ou propriedade ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo de dado primitivo
    public boolean motor; // boolean é um tipo de dado primitivo

    // método que converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }
}