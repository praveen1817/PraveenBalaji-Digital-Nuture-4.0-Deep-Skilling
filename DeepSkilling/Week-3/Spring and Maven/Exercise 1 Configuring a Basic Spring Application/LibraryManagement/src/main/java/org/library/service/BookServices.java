package org.library.service;

import org.library.Respository.BookRespository;

public class BookServices {
    public BookServices(){
        System.out.println("The object of BookService is Loaded");
    }
    public void setRepository(BookRespository repository) {
        this.repository = repository;
    }

    BookRespository repository;

    public void useService() {
        System.out.println("Loading Contents From Repository");
        if (repository == null) {
            System.out.println("invalid Object");
        } else {
            repository.display();

        }

    }
}
