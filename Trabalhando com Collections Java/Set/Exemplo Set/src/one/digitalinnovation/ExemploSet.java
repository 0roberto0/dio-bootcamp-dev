package one.digitalinnovation;

import javax.net.ssl.SSLEngineResult;
import java.util.*;
import java.util.concurrent.Phaser;

public class ExemploSet {
    public static void main(String[] args) {

//        Set notas = new HashSet<>(); // antes no java 5
//        HashSet<Double> notas  = new HashSet<>();
//        Set<Double> notas = new HashSet<>(); // Generics(jdk 5) - Diamont operator (jdk 7)
//        Set<Double> notas = Set.of(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6);
//        notas.add(1D);
//        notas.remove(5D);
//        System.out.println(notas);

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6));
        System.out.println(notas.toString());

//        System.out.println("Exiba a posiçào da nota 5.0: ");
        // não consegue pesquisar por posição pois não existe o indexof
//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // não consegue trabalhar com posição no set então não é permitido.
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // não consegue substituir pois não tem essa formula.
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5D));

//        System.out.println("Exiba a terceira nota adicionada: ");
        // não consegue pois não tem o metodo get pra passar o indice e retornar a nota.
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir a soma dos valroes: " + soma);

        System.out.println("Exima a media das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0D);
        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0: ");
        // não consigo saber qual a posição 0

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7D);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5D);
        notas2.add(7D);
        notas2.add(0D);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto 1");
        notas.clear();

        System.out.println("Confira se a conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se a conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se a conjunto 3 está vazio: " + notas3.isEmpty());
    }
}
