package questao_2;

public class PerfilMensalista implements EstrategiaCobranca {

    private static final double VALOR_FIXO = 200.00;

    @Override
    public double calcularValor(int minutos) {
        return VALOR_FIXO;
    }
}