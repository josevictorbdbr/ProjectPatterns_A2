package questao3;

public class Leite implements ItemPedido {

    @Override
    public String getDescricao() {
        return "Leite";
    }

    @Override
    public double getPreco() {
        return 2.00;
    }
}