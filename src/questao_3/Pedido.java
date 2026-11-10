package questao3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ItemPedido bebida;
    private List<ItemPedido> complementos;

    public Pedido(ItemPedido bebida) {
        this.bebida = bebida;
        this.complementos = new ArrayList<>();
    }

    public void adicionarComplemento(ItemPedido complemento) {
        complementos.add(complemento);
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder(bebida.getDescricao());

        for (ItemPedido complemento : complementos) {
            descricao.append(" + ").append(complemento.getDescricao());
        }

        return descricao.toString();
    }

    public double getPreco() {
        double total = bebida.getPreco();

        for (ItemPedido complemento : complementos) {
            total += complemento.getPreco();
        }

        return total;
    }
}