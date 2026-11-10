package questao3;

public class Cha implements ItemPedido {

    @Override
    public String getDescricao() {
        return "Cha";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
}