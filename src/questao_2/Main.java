package questao_2;

public class Main {

    public static void main(String[] args) {

        String placa = "ABC1234";
        int minutos = 120;

        Ticket ticket = new Ticket(placa, minutos, new PerfilRotativo());

        System.out.println("-----ESTACIONAMENTO-----");
        System.out.println("Placa: " + ticket.getPlaca());
        System.out.println("Tempo: " + ticket.getMinutos() + " minutos");

        System.out.println("\n-----ROTATIVO-----");
        System.out.printf("Valor: R$ %.2f%n", ticket.calcularValor());

        System.out.println("\n-----MENSALISTA-----");
        ticket.alterarPerfil(new PerfilMensalista());
        System.out.printf("Valor: R$ %.2f%n", ticket.calcularValor());

        System.out.println("\n-----CONVENIADO-----");
        ticket.alterarPerfil(new PerfilConveniado());
        System.out.printf("Valor: R$ %.2f%n", ticket.calcularValor());

        System.out.println("\n-----TROCA DE PERFIL-----");

        ticket.alterarPerfil(new PerfilRotativo());
        System.out.printf("Rotativo: R$ %.2f%n", ticket.calcularValor());

        ticket.alterarPerfil(new PerfilConveniado());
        System.out.printf("Conveniado: R$ %.2f%n", ticket.calcularValor());
    }
}