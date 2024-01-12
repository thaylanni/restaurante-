package src;
public class ItemMenu {
    //aqui são os atributos
    private String nome;
    private double preco;
//aqui são os construtores 
    public ItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // aqui são os método para exibir informações do item do menu
    public void exibirInformacoes() {
        System.out.println("Item do Menu: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
