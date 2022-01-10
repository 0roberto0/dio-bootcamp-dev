package one.digitalinnovation;

import java.util.*;

public class ExerciciosPopulacao {
    public static void main(String[] args) {

        Map<String, Integer> populacao = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        System.out.println(populacao);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
        if (!populacao.containsKey("PB")) {
            populacao.put("PB", 4039277);
            System.out.println("PB foi adicionado");
        } else {
            System.out.println("PB NAO foi adicionado");
        }
        System.out.println(populacao);

        System.out.println("Exiba a população do estado PE: " + populacao.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacao1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao1);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
        System.out.println(populacao2);

        Collection<Integer> qtdPopulacao = populacao1.values();
        String estadoMinPopulacao = "";
        String estadoMaxPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacao1.entrySet()) {
            if (entry.getValue().equals(Collections.max(qtdPopulacao))) {
                estadoMaxPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.min(qtdPopulacao))) {
                estadoMinPopulacao = entry.getKey();
            }
        }
        System.out.println("Exiba o estado com o menor população " + estadoMinPopulacao + " quantidade população " + Collections.min(qtdPopulacao));
        System.out.println("Exiba o estado com a maior população " + estadoMaxPopulacao + " quantidade população " + Collections.max(qtdPopulacao));

        int soma = 0;
        Iterator<Integer> iterator = populacao.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / populacao.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacao.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) {
                iterator1.remove();
            }
        }
        System.out.println(populacao);

        populacao.clear();
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: " + populacao);

        System.out.println("Confira se a lista está vazia: " + populacao.isEmpty());
    }
}
