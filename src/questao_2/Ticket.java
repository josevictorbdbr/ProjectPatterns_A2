package questao_2;

public class Ticket {

    private String placa;
    private int minutos;
    private EstrategiaCobranca estrategia;

    public Ticket(String placa, int minutos, EstrategiaCobranca estrategia) {
        this.placa = placa;
        this.minutos = minutos;
        this.estrategia = estrategia;
    }

    public void alterarPerfil(EstrategiaCobranca estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        return estrategia.calcularValor(minutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }
}