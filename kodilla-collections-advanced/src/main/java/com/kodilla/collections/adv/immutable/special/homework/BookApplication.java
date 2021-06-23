package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = BookManager.createBook("Narrenturm", "Sapkowski");
        Book book2 = BookManager.createBook("Fabrykantka aniolkow", "Lackberg");
        Book book3 = BookManager.createBook("Pod mocnym aniolem", "Pilch");
        Book book4 = BookManager.createBook("Pod mocnym aniolem", "Pilch");


        System.out.println(book1==book2);
        System.out.println(book2==book3);
        System.out.println(book3==book4);
    }
}
