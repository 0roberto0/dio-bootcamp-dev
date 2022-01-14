package com.digitalinnovationone.utilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Herry Potter");
        livro.setCodigo("D35FD");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("J.K. Rowling");

        livro.exibir();

        ((AbstractApplicationContext) factory).close();
    }
}
