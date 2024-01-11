import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando opções de comida (itens do menu)
        ItemMenu pizzaPortuguesa = new ItemMenu("Pizza Portuguesa", 35.00);
        ItemMenu pizzaNordestina = new ItemMenu("Pizza Nordestina", 60.00);
        ItemMenu pizzaCalabresa = new ItemMenu("Pizza Calabresa", 30.00);

        // Usando Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando o nome do cliente
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        // Solicitando o número da mesa
        System.out.print("Digite o número da sua mesa: ");
        int numeroMesa = scanner.nextInt();
        scanner.nextLine(); 

        // Criando cliente com o nome fornecido
        Cliente cliente1 = new Cliente(nomeCliente, numeroMesa);

        // Criando pedido
        Pedido pedidoCliente1 = new Pedido(cliente1);

        System.out.println("Bem-vindo ao restaurante, " + cliente1.getNome() + "! Escolha as opções de pizza:");

        // Exibindo opções de comida
        System.out.println("1. Pizza Portuguesa - R$35.00");
        System.out.println("2. Pizza Nordestina - R$60.00");
        System.out.println("3. Pizza Calabresa - R$30.00");

        // Solicitando a escolha do usuário
        while (true) {
            System.out.print("Digite o número da pizza desejada: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            ItemMenu itemEscolhido = null;

            switch (escolha) {
                case 1:
                    itemEscolhido = pizzaPortuguesa;
                    break;
                case 2:
                    itemEscolhido = pizzaNordestina;
                    break;
                case 3:
                    itemEscolhido = pizzaCalabresa;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.print("Quantidade desejada: ");
            int quantidade = scanner.nextInt();

            // Adicionando a escolha ao pedido
            pedidoCliente1.adicionarItem(itemEscolhido, quantidade);
            break;
        }

        // Exibindo o pedido final
        System.out.println("Pedido de " + cliente1.getNome() + ":");
        pedidoCliente1.exibirPedido();

        // Solicitando confirmação do pedido
        System.out.print("Deseja confirmar o pedido? (1 para sim, 2 para não): ");
        int confirmar = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        if (confirmar == 1) {
            // Solicitando forma de pagamento
            System.out.println("Escolha a forma de pagamento:");
            System.out.println("1. Cartão");
            System.out.println("2. PIX");
            System.out.println("3. Dinheiro");

            int escolhaPagamento = scanner.nextInt();
            scanner.nextLine();

            String formaPagamento;
            switch (escolhaPagamento) {
                case 1:
                    formaPagamento = "Cartão";
                    break;
                case 2:
                    formaPagamento = "PIX";
                    break;
                case 3:
                    formaPagamento = "Dinheiro";
                    break;
                default:
                    formaPagamento = "Forma de pagamento inválida";
            }

            // Criando objeto Pagamento
            Pagamento pagamento = new Pagamento(formaPagamento);

            // Exibindo detalhes do pagamento
            pagamento.exibirDetalhesPagamento();
            System.out.println("Agradecemos pelo seu pedido!");
        } else {
            System.out.println("Pedido cancelado. Obrigado!");
        }

        // Fechando o Scanner
        scanner.close();
    }
}
