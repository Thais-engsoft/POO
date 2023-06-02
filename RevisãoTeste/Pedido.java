import java.util.ArrayList;
import java.util.List;

class Pedido {
    private Cliente cliente;
    private String data;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente, String data) {
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getValor() * item.getQuantidade();
        }
        return total;
    }
}
