
class Pagamento {
    String formaPagamento;

    public Pagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void exibirDetalhesPagamento() {
        System.out.println("Forma de pagamento: " + formaPagamento);
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}

