package ru.defezis.library.web;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.defezis.library.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookServlet extends HttpServlet {
    private ConfigurableApplicationContext springContext;
    private BookService bookService;

    @Override
    public void init() {
        springContext = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        bookService = springContext.getBean(BookService.class);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Book with id '1' = " + bookService.get(1));
        request.getRequestDispatcher("/index.html").forward(request, response);
    }
}
