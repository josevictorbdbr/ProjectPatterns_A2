
package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade;
    private boolean zerado;
    private List<ObserverEstoque> observers;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.zerado = quantidade == 0;
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(ObserverEstoque observer) {
        observers.add(observer);
    }

    public void removerObserver(ObserverEstoque observer) {
        observers.remove(observer);
    }

    public void alterarQuantidade(int novaQuantidade) {

        if (novaQuantidade < 0) {
            throw new IllegalArgumentException(
                "Quantidade nao pode ser negativa."
            );
        }

        if (this.quantidade == novaQuantidade) {
            return;
        }

        this.quantidade = novaQuantidade;
        this.zerado = novaQuantidade == 0;

        notificarObservers();
    }

    private void notificarObservers() {
        for (ObserverEstoque observer : observers) {
            observer.atualizar(nome, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean zerado() {
        return zerado;
    }
}
