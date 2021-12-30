package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Exercicio 1
public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> vlrTemp = new ArrayList<>();

        int i = 1;
        double soma = 0.0;
        while (i < 7) {
            System.out.println("Temperatura do mês " + i + " - " + NomeMes(i));
            double temp = sc.nextDouble();
            vlrTemp.add(temp);
            soma += temp;
            i++;
        }
        double mediaTemperatura = soma/vlrTemp.size();
        System.out.println("Media: " + mediaTemperatura);

        int j = 1;
        for (Double temp : vlrTemp) {
            if (temp > mediaTemperatura) {
                System.out.println(j + " - " + NomeMes(j) + " | temperatura: " + vlrTemp.get(j - 1));
            }
            j++;
        }
    }

    public static String NomeMes(int i) {
        String mes;
        switch (i) {
            case 1: mes = "Janeiro"; break;
            case 2: mes = "Fevereiro"; break;
            case 3: mes = "Março"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Maio"; break;
            case 6: mes = "Junho"; break;
            default: mes = "Não foi informado um valor valido"; break;
        }
        return mes;
    }
}


