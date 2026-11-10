package questao3;

public class Calda implements ItemPedido {

    @Override
    public String getDescricao() {
        return "Calda";
    }

    @Override
    public double getPreco() {
        return 1.50;
    }
}