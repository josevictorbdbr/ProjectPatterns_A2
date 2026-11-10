package questao1;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObserver(compras);
        produto.adicionarObserver(vendas);
        produto.adicionarObserver(auditoria);

        System.out.println("------MONITORAMENTE ESTOQUE-----");

        produto.alterarQuantidade(4);
        System.out.println();

        produto.alterarQuantidade(0);
        System.out.println();

        produto.alterarQuantidade(8);
        System.out.println();

        produto.alterarQuantidade(8);
        System.out.println();

        produto.removerObserver(compras);
        System.out.println("compras removido");

        produto.alterarQuantidade(3);
        System.out.println();

        produto.alterarQuantidade(12);
    }
}