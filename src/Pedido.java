package src;
import java.util.ArrayList;

class Pedido {
    //aqui são os atribuitos
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
//construtor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ItemMenu itemMenu, int quantidade) {
        itens.add(new ItemPedido(itemMenu, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.calcularSubtotal();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Pedido de " + cliente.getNome() + ":");
        for (ItemPedido itemPedido : itens) {
            System.out.println(itemPedido.getQuantidade() + "x " + itemPedido.getItemMenu().getNome());

        }
        System.out.println("Total: R$" + calcularTotal());
    }


    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    // aqui são os método para verificar se o pedido está vazio
    public boolean estaVazio() {
        return itens.isEmpty();
    }

    // aqui são os método para remover todos os itens do pedido
    public void limparPedido() {
        itens.clear();
    }

}
