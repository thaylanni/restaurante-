
class ItemPedido {
    private ItemMenu itemMenu;
    private int quantidade;

    public ItemPedido(ItemMenu itemMenu, int quantidade) {
        this.itemMenu = itemMenu;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return itemMenu.getPreco() * quantidade;
    }

    public ItemMenu getItemMenu() {
        return itemMenu;
    }

    public void setItemMenu(ItemMenu itemMenu) {
        this.itemMenu = itemMenu;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para exibir informações do item do pedido
    public void exibirItemPedido() {
        System.out.println("Item do Pedido:");
        System.out.println("  - Nome: " + itemMenu.getNome());
        System.out.println("  - Preço unitário: R$" + itemMenu.getPreco());
        System.out.println("  - Quantidade: " + quantidade);
        System.out.println("  - Subtotal: R$" + calcularSubtotal());
    }

    //
}
