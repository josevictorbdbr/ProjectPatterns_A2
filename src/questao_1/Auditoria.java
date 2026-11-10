package questao1;

public class Auditoria implements ObserverEstoque {

    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("Alteracao registrada: " + nomeProduto + " Nova quantidade: " + quantidade);
    }
}