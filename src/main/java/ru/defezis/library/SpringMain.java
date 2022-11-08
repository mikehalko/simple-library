package ru.defezis.library;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.defezis.library.model.Book;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("[SpringMain]: bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));

        Book bean = appCtx.getBean(Book.class);
        System.out.println("[SpringMain]: bean.info() = \"" + bean.info() + '\"');

        appCtx.close();
    }
}