package one.digitalinnovation;

import java.util.*;

//Exercicio 2
public class ExercicioLinguagemFavorita {
    public static void main(String[] args) {

        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>() {{
            add(new LinguagemFavorita("Java", 1995, "inteliJ"));
            add(new LinguagemFavorita("Delphi", 1994, "RAD Studio"));
            add(new LinguagemFavorita("Javascript", 1996 , "Visual studio code"));
        }};
        System.out.println(minhasLinguagens);

        System.out.println();
        System.out.println("--\tA. Ordem de inserção\t--");
        Set<LinguagemFavorita> minhasLinguagensLinkedHashSet = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1995, "inteliJ"));
            add(new LinguagemFavorita("Delphi", 1994, "RAD Studio"));
            add(new LinguagemFavorita("Javascript", 1996 , "Visual studio code"));
        }};
        for (LinguagemFavorita linguagem: minhasLinguagensLinkedHashSet) {
            System.out.println(linguagem);
        }

        System.out.println();
        System.out.println("--\tB. Ordem natural (Nome)\t--");
        Set<LinguagemFavorita> minhasLinguagens1 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens1) {
            System.out.println(linguagem);
        }

        System.out.println();
        System.out.println("--\tC. Ordem IDE\t--");
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<LinguagemFavorita>(new ComparatorIDe());
        minhasLinguagens2.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem: minhasLinguagens2) {
            System.out.println(linguagem);
        }

        System.out.println();
        System.out.println("--\tD. Ano de criação e nome\t--");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem: minhasLinguagens3) {
            System.out.println(linguagem);
        }

        System.out.println();
        System.out.println("--\tE. Nome, ano de criação e IDE\t--");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem: minhasLinguagens4) {
            System.out.println(linguagem);
        }

        System.out.println();
        System.out.println("--\tF. Exiba o nome no console uma a baixo da outra\t--");
        for (LinguagemFavorita linguagem: minhasLinguagens) {
            System.out.println(linguagem.getNome());
        }

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    public String nome;
    public int anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", Ano=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }
}

class ComparatorIDe implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if (anoDeCriacao != 0) {
            return anoDeCriacao;
        }
        return o1.nome.compareToIgnoreCase(o2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if (nome != 0) {
            return nome;
        }
        if (anoDeCriacao != 0) {
            return anoDeCriacao;
        }
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}
