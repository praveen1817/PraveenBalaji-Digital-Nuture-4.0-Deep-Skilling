package org.library;
import org.library.service.BookServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext service= new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServices bookService=(BookServices)service.getBean("bkService");
        bookService.useService();
    }
}
