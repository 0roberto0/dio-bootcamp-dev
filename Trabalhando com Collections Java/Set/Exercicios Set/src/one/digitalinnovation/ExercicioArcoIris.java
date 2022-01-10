package one.digitalinnovation;

import java.util.*;

//Exercicio 1
public class ExercicioArcoIris {
    public static void main(String[] args) {

        System.out.println("--\tA. Exiba todas as cores uma abaixo da outra\t--");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("vermelha");
        coresArcoIris.add("laranja");
        coresArcoIris.add("amarela");
        coresArcoIris.add("verde");
        coresArcoIris.add("azul");
        coresArcoIris.add("azul-escuro");
        coresArcoIris.add("violeta");

        for (String cor: coresArcoIris) System.out.println(cor);

        System.out.println("--\tB. A quantidade de cores que o arco-iris tem\t--");
        System.out.println(coresArcoIris.size());

        System.out.println("--\tC. Exiba as cores em ordem alfabética\t--");
        Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris1);

        System.out.println("--\tD. Exiba as cores na ordem inversa doque foi informada\t--");
        Set<String> coresArcoIris2 = new LinkedHashSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
        List<String> listaCoresArcoIris = new ArrayList<>(coresArcoIris2);
        Collections.reverse(listaCoresArcoIris);
        System.out.println(listaCoresArcoIris);

        System.out.println("--\tE. Exiba todas as cores que começam com a letra V\t--");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        System.out.println("--\tF. Remova todas as cores que não começam com a letra V\t--");
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()) {
            if(!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("--\tG. Limpe o conjunto\t--");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("--\tH. Confira se o conjunto está vazio\t--");
        System.out.println(coresArcoIris.isEmpty());
    }
}
