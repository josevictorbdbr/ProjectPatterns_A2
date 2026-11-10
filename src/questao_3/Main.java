package questao3;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(new Espresso());
        pedido1.adicionarComplemento(new Leite());

        Pedido pedido2 = new Pedido(new Cha());
        pedido2.adicionarComplemento(new Chantilly());
        pedido2.adicionarComplemento(new Calda());

        Pedido pedido3 = new Pedido(new Espresso());
        pedido3.adicionarComplemento(new Leite());
        pedido3.adicionarComplemento(new Leite());
        pedido3.adicionarComplemento(new Chantilly());

        System.out.println("-----PEDIDOS DA CAFETERIA-----");

        System.out.println("\nPedido 1:");
        System.out.println("Descricao: " + pedido1.getDescricao());
        System.out.printf("Preco: R$ %.2f%n", pedido1.getPreco());

        System.out.println("\nPedido 2:");
        System.out.println("Descricao: " + pedido2.getDescricao());
        System.out.printf("Preco: R$ %.2f%n", pedido2.getPreco());

        System.out.println("\nPedido 3:");
        System.out.println("Descricao: " + pedido3.getDescricao());
        System.out.printf("Preco: R$ %.2f%n", pedido3.getPreco());
    }
}