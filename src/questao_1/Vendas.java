package questao1;

public class Vendas implements Observer {
    private boolean zerado;

    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        if (zerado && quantidade > 0) {
            System.out.println("Produto " + nomeProduto + " em estoque");
        }
        zerado = quantidade == 0;
    }
}