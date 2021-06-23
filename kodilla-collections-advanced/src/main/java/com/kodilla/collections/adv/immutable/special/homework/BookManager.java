package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static Book createBook(String title, String author) {

        Book book = new Book(title, author);
        if (books.contains(book)) {
            int index= books.indexOf(book);
            return books.get(index);
        } else {
            books.add(book);
            return book;
        }
    }

    private static List<Book> books = new ArrayList<>();

}
