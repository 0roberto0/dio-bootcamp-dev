package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Exercicio 2
public class Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = "";

        List<String> respCrime = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.println(retPergunta(i));
            do {
                resp = sc.next();
                if(resp.equals("sim") || resp.equals("nao")) {
                    respCrime.add(resp);
                } else {
                    System.out.println(retPergunta(i));
                }
            } while(!resp.equals("sim") && !resp.equals("nao"));

        }

        int countResp = Collections.frequency(respCrime, "sim");
        switch (countResp) {
            case 2 : System.out.println("Suspeita"); break;
            case 3 :
            case 4 : System.out.println("Cumplice"); break;
            case 5 : System.out.println("Assasina"); break;
            default: System.out.println("Inocente");; break;
        }
    }

    public static String retPergunta(int i) {
        String pergunta;
        switch (i) {
            case 1: pergunta = "Telefonou para a vitima? "; break;
            case 2: pergunta = "Esteve no local do crime?  "; break;
            case 3: pergunta = "Mora perto da vitima? "; break;
            case 4: pergunta = "Devia para a vitima? "; break;
            case 5: pergunta = "Já trabalhou com a vitima? "; break;
            default: pergunta = "Não foi informado um valor valido"; break;
        }
        return pergunta;
    }
}
