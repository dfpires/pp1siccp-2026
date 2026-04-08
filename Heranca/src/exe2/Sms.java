package exe2;

public class Sms extends CanalNotificacao {
    private int nroTelefone;
    public Sms() {
        super();
    }
    public Sms(String destinatario, String mensagem, int nroTelefone) {
        super(destinatario, mensagem);
        this.nroTelefone = nroTelefone;
    }
    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número " + this.nroTelefone +
        " : " + this.mensagem);
    }
    @Override
    public String toString() {
        return "Sms{" +
                super.toString() +
                "nroTelefone=" + nroTelefone +
                '}';
    }
    public int getNroTelefone() {
        return nroTelefone;
    }
    public void setNroTelefone(int nroTelefone) {
        this.nroTelefone = nroTelefone;
    }
}