public class Cliente {
    //aqui são os atributos
    private String nome;
    private int numeroMesa;
//aqui são os construtores
    public Cliente(String nome, int numeroMesa) {
        this.nome = nome;
        this.numeroMesa = numeroMesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome);
        System.out.println("Número da Mesa: " + numeroMesa);
    }
}
