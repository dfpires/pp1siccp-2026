package exe1;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel{
    private boolean trancada = true;
    @Override
    public void validarAcesso(String senha) {
        if (senha.equals("1234")){
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
    @Override
    public void ligar() {
        this.trancada = false;
        System.out.println("Porta destrancada");
    }
    @Override
    public void desligar() {
        this.trancada = true;
        System.out.println("Porta trancada");
    }
}
