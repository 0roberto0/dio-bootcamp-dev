package digitalinnovation.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Teste {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer fstoken = new StringTokenizer(buff.readLine());

        int a = Integer.parseInt(fstoken.nextToken());
        int b = Integer.parseInt(fstoken.nextToken());
        int total = (a + b);

        System.out.println("X = " + total);


//        Scanner leitor = new Scanner(System.in);
//        int N = leitor.nextInt();
//        int a = leitor.nextInt(); //+ leitor.nextInt();
/*        //TODO: Complete o If com a condição que soluciona o problema.
        if ((A) > N)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");*/

  /*      switch (a) {
            case 61: System.out.println("Brasilia\n");
                break;
            case 71: System.out.println("Salvador\n");
                break;
            case 11: System.out.println("Sao Paulo\n");
                break;
            case 21: System.out.println("Rio de Janeiro\n");
                break;
            case 32: System.out.println("Juiz de Fora\n");
                break;
            case 19: System.out.println("Campinas\n");
                break;
            case 27: System.out.println("Vitoria\n");
                break;
            case 31: System.out.println("Belo Horizonte\n");
                break;
            default: System.out.println("DDD nao cadastrado\n");


                int a = Integer.parseInt(stoken);
        }*/

    }
}
