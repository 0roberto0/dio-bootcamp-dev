package one.digitalinnovation.basecamp;

public class Emprestimo {
    public static void calcularEmprestimo(double valor) {
        double taxa = valorTaxas(valor);
        double juros = valor * taxa;
        double valorFinal = valor + juros;

        System.out.println("Valor emprestimo: " + valor);
        System.out.println("% taxa: " + taxa);
        System.out.println("Valor de juros: " + juros);
        System.out.println("Valor a pagar: " + valorFinal);
    }
    private static double valorTaxas(double valor) {
        double valorTaxa;
        if (valor <= 5000) {
            valorTaxa = 0.10;
        } else if (valor > 5000 && valor <= 10000) {
            valorTaxa = 0.20;
        } else {
            valorTaxa = 0.30;
        }
        return valorTaxa;
    }
}
