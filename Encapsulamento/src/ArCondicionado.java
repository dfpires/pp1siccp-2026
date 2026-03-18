public class ArCondicionado {
    // Atributos Privados
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    // Construtor sem parâmetros
    public ArCondicionado() {
        this.marca = "Generico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    // Construtor com parâmetros
    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.setMarca(marca);
        this.modelo = modelo;
        this.setTemperatura(temperatura); // Usa o setter para validar a temp inicial
        this.ligado = false;
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        if (marca.length() >= 3){
            this.marca = marca;
        }
        else System.out.println("Marca inválida");
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getTemperatura() { return temperatura; }

    public void setTemperatura(int temperatura) {
        // Regra de Ouro: Validação de faixa de temperatura
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: Temperatura " + temperatura + "°C inválida (Permitido: 16°C a 30°C).");
        }
    }

    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }

    // Métodos Públicos
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Aparelho ligado.");
        }
    }

    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Aparelho desligado.");
        }
    }

    public void ajustarTemperatura(int novaTemp) {
        if (this.ligado) {
            this.setTemperatura(novaTemp);
        } else {
            System.out.println("Aviso: Ligue o aparelho antes de ajustar a temperatura.");
        }
    }

    public void modoTurbo() {
        if (this.ligado) {
            this.processarResfriamentoRapido();
        } else {
            System.out.println("Aviso: Não é possível ativar Modo Turbo com o aparelho desligado.");
        }
    }

    // Método Privado (Lógica interna escondida)
    private void processarResfriamentoRapido() {
        System.out.println("Aumentando rotação do compressor...");
        System.out.println("Ligando ventilação máxima...");
        this.setTemperatura(16); // Força a temperatura mínima permitida
    }

    @Override
    public String toString() {
        return "ArCondicionado [" + marca + " " + modelo +
                " | Temp: " + temperatura + "°C" +
                " | Status: " + (ligado ? "Ligado" : "Desligado") + "]";
    }
}