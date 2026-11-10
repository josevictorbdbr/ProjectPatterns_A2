package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade;
    private boolean zerado;
    private List<observersToque> observers;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.zerado = quantidade == 0;
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(observersToque observer) {
        observers.add(observer);
    }
    public void removerObserver(observersToque observer) {
        observers.remove(observer);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa.");
        }
        if (this.quantidade == novaQuantidade) {
            return;
        }

        this.quantidade = novaQuantidade;

        notificarObservers();

        zerado = novaQuantidade == 0;
    }

    private void notificarObservers() {
        for (observersToque observer : observers) {
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