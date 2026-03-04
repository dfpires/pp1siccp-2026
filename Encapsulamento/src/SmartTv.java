public class SmartTv {
    private String marca, modelo;
    private int volume;

    public SmartTv(){

    }
    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume); // para não perder o encapsulamento
    }
    // setter do volume
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    public int getVolume(){
        return this.volume;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}