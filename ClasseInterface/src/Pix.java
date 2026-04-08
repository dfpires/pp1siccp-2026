public class Pix implements Pagamento{

    @Override
    public void autorizar(double valor) {
        System.out.println("Gerando QRCode para a chave pix");
        System.out.println("Pagamento no valor " + valor + " foi enviado instantaneamente");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no App do banco");
    }
}
