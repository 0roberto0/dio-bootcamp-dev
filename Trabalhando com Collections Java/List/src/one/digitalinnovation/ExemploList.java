package one.digitalinnovation;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
//        List notas = new ArrayList<>(); // antes do java 5
//        List<Double> notas = new ArrayList<>(); // Generics(jdk 5 ) - Diamont operator
//        ArrayList<Double> notas = new ArrayList<>(); //
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d));
/*        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d);
        notas.add(10d);
        System.out.println(notas);*/

/*        List<Double> notas = List.of(7d, 8.5, 9.3, 5d);
        notas.add(10d);
        notas.remove(5d);
        System.out.println(notas);*/


        System.out.println("Crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<>();
        notas.add(7D);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição oda nota 5.0: " + notas.indexOf(5D));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5D), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5D));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: " );
        notas.remove(0D);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: " );
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: " );
        Iterator<Double> iteratorRemove7 = notas.iterator();
        while (iteratorRemove7.hasNext()) {
            Double next = iteratorRemove7.next();
            if (next < 7 ) iteratorRemove7.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
