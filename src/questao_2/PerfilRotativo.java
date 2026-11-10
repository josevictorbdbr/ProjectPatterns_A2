package questao_2;

public class PerfilRotativo implements EstrategiaCobranca {

    private static final double VALOR_HORA = 10.00;

    @Override
    public double calcularValor(int minutos) {
        int horas = (int) Math.ceil(minutos / 60.0);
        return horas * VALOR_HORA;
    }
}