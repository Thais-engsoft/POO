import java.util.List;
import java.util.ArrayList;

public class tudo {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João", "123456789", "Rua A");
        Cliente cliente2 = new Cliente("Maria", "987654321", "Rua B");
        Cliente cliente3 = new Cliente("José", "000000000", "Rua C");
        // Criando pedidos
        Pedido pedido1 = new Pedido(cliente1, "01/01/2023");
        Pedido pedido2 = new Pedido(cliente2, "02/01/2023");
        Pedido pedido3 = new Pedido(cliente3, "03/01/2023");

        // Adicionando itens aos pedidos
        ItemPedido itemArroz = new ItemPedido("arroz", 1, 10.0);
        ItemPedido itemFeijao = new ItemPedido("feijão", 2, 8.0);
        ItemPedido itemCarne = new ItemPedido("carne", 3, 25.0);

        pedido1.adicionarItem(itemArroz);
        pedido2.adicionarItem(itemFeijao);
        pedido3.adicionarItem(itemCarne);


        // Criando lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        // Imprimindo informações dos pedidos
        for (Pedido pedido : pedidos) {
            Cliente cliente = pedido.getCliente();
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Data do pedido: " + pedido.getData());
            System.out.println("Valor total: " + pedido.calcularTotal());
            System.out.println();
        }
    }
}
