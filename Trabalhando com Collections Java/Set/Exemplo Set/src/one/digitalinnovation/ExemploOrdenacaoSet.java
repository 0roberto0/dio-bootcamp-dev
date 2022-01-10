package one.digitalinnovation;

import java.util.*;

/*
Serie 1 = nome: got, genero: fantasia, tempoEpisodio: 60
Serie 2 = nome: dark, genero: drama, tempoEdpisodio: 60
Serie 3 = nome: that '70s show', genero: comedia, tempoEpisodio: 25
*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show'", "comedia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show'", "comedia", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (tempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Genero/tempoEpisodio\t--");
        Set<Serie> minhasSerie3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSerie3.addAll(minhasSeries);
        for (Serie serie: minhasSerie3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Generoo\t--");
        Set<Serie> minhasSerie4 = new TreeSet<>(new ComparatorGenero());
        minhasSerie4.addAll(minhasSeries);
        for (Serie serie: minhasSerie4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem tempoEpisodio\t--");
        Set<Serie> minhasSerie5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSerie5.addAll(minhasSeries);
        for (Serie serie: minhasSerie5) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEdpisodio='" + tempoEpisodio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(o.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareTo(s2.getGenero());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

