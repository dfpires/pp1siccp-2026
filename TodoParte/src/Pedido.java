import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>(); // aloca espaço na memória
    }
    // o cliente veio pronto, mostrando sua independência do pedido
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<>();
    }
    // adiciona um item de pedido no vetor ou no pedido
    public void adicionaItemPedido(int id, float qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    // o cliente veio pronto, mostrando sua independência do pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", itens do pedido = " + itensPedido +
                '}';
    }
    public float calculaTotalPedido(){
        // para cada ItemPedido
        float soma = 0;
        for(ItemPedido ip : this.itensPedido){
            soma += ip.getQtde() * ip.getProduto().getPreco();
        }
        return soma;
    }
}
