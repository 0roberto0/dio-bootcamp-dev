package one.digitalinnovation.basecamp;

public class Mensagem {
    public static String qualHorario(double hora) {
        String mensagem;
        if (hora >= 4.59 && hora <= 12.59) {
            mensagem = bomDia();
        } else if (hora >= 13 && hora <= 18.59) {
            mensagem = boaTarde();
        } else if (hora <= 24) {
            mensagem = boaNoite();
        } else {
            mensagem = horarioInvalido();
        }

        return mensagem;
    }

    private static String bomDia() {
        return "Bom dia!";
    }

    private static String boaTarde() {
        return "Boa tarde!";
    }

    private static String boaNoite() {
        return "Boa noite!";
    }

    private static String horarioInvalido() {
        return "Hora inválida!";
    }
}
