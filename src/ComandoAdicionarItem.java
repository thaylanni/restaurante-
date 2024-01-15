
// Classe para adicionar item ao pedido
class ComandoAdicionarItem implements Comando {
    private Pedido pedido;
    private ItemMenu itemMenu;
    private int quantidade;

    public ComandoAdicionarItem(Pedido pedido, ItemMenu itemMenu, int quantidade) {
        this.pedido = pedido;
        this.itemMenu = itemMenu;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        pedido.adicionarItem(itemMenu, quantidade);
    }
}


