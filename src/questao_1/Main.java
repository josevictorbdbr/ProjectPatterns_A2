package questao1;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("------MONITORAMENTO DE ESTOQUE-----");

        produto.alterarQuantidade(4);
        System.out.println();

        produto.alterarQuantidade(0);
        System.out.println();

        produto.alterarQuantidade(8);
        System.out.println();

        produto.alterarQuantidade(8);
        System.out.println();

        produto.removerObservador(compras);
        System.out.println("-----COMPRAS REMOVIDO-----");

        produto.alterarQuantidade(3);
        System.out.println();

        produto.alterarQuantidade(12);
    }
}