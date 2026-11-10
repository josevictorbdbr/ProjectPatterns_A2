package questao_2;

public class PerfilConveniado implements EstrategiaCobranca {

    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_HORA = 10.00;
    private static final double DESCONTO = 0.20;

    @Override
    public double calcularValor(int minutos) {

        if (minutos <= MINUTOS_GRATUITOS) {
            return 0.0;
        }

        int minutosCobrados = minutos - MINUTOS_GRATUITOS;
        int horas = (int) Math.ceil(minutosCobrados / 60.0);

        double valor = horas * VALOR_HORA;

        return valor - (valor * DESCONTO);
    }
}