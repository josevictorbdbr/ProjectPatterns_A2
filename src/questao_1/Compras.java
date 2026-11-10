package questao1;

public class Compras implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("Produto: " + nomeProduto +" Estoque: " + quantidade);

        if (quantidade < 5) {
            System.out.println("Estoque abaixo de 5 produtos");
        }
    }
}