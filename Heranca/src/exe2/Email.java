package exe2;

public class Email extends CanalNotificacao {
    private String assunto;
    public Email() {
        super(); // reutilização de código
    }
    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem); // reutilização de código
        this.assunto = assunto;
    }
    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para " + this.destinatario +
                " com o assunto " + this.assunto + ":" + this.mensagem);
    }
    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
