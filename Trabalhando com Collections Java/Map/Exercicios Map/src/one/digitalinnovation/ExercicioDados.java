package one.digitalinnovation;

import java.util.*;

public class ExercicioDados {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();
        for (int i = 0; i < 100; i++) {
            int number = geradorDeLancamento.nextInt(100);
            valores.add(number);
        }
        System.out.println(valores);

        Map<Integer, Integer> lancamento = new HashMap<>();
        for (Integer resultado: valores) {
            if(lancamento.containsKey(resultado)) {
                lancamento.put(resultado, (lancamento.get(resultado) + 1));
            }else {
                lancamento.put(resultado, 1);
            }
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamento.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
