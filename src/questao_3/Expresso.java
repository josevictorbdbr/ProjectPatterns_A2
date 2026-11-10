package questao3;

public class Espresso implements ItemPedido {

    @Override
    public String getDescricao() {
        return "Espresso";
    }
    @Override
    public double getPreco() {
        return 6.00;
    }
}