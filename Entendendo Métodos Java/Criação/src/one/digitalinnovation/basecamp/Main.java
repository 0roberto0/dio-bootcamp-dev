package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------CALCULADORA-----------");
        int a,b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        System.out.println("Valor: " + a + " + Valor: " + b + " = " + Calculadora.soma(a,b));
        System.out.println("Valor: " + a + " - Valor: " + b + " = " + Calculadora.subtracao(a,b));
        System.out.println("Valor: " + a + " * Valor: " + b + " = " + Calculadora.multiplicacao(a,b));
        System.out.println("Valor: " + a + " / Valor: " + b + " = " + Calculadora.divisao(a,b));
        System.out.println();

        System.out.println("---------MENSAGEM-DO-DIA----------");
        int hora;
        System.out.println("Digite a hora: ");
        hora = scan.nextInt();
        System.out.println(Mensagem.qualHorario(hora));
        System.out.println();

        System.out.println("------------EMPRESTIMO-------------");
        double valorEmprestimo;
        System.out.println("Digite o valor do Emprestimo: ");
        valorEmprestimo = scan.nextDouble();
        Emprestimo.calcularEmprestimo(valorEmprestimo);
    }
}
