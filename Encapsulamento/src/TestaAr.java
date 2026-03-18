public class TestaAr {
    public static void main(String[] args) {
        // 1. Instância com marca/modelo preferidos e 22°C
        ArCondicionado meuAr = new ArCondicionado("Samsung", "WindFree", 22);

        // 2. Teste de temperatura inválida e válida
        System.out.println("--- Testando ajustes de temperatura ---");
        meuAr.ajustarTemperatura(10); // Deve dar erro (aparelho desligado + valor baixo)
        meuAr.ligar();                // Precisamos ligar para ajustar
        meuAr.ajustarTemperatura(10); // Deve dar erro (valor fora da faixa)
        meuAr.ajustarTemperatura(25); // Deve funcionar

        // 3. Imprimir dados
        System.out.println("\nEstado atual: " + meuAr.toString());

        // 4. Testar modoTurbo com aparelho desligado
        System.out.println("\n--- Testando Modo Turbo ---");
        meuAr.desligar();
        meuAr.modoTurbo();

        // 5. Ligar, usar modoTurbo e verificar estado final
        meuAr.ligar();
        meuAr.modoTurbo();
        System.out.println("\nEstado Final: " + meuAr.toString());
    }
}