package org.BehaviouralPatterns.IteratorPattern;

import java.util.Iterator;

public class ClientV4 {
    public static void main(String[] args) {
        BookCollectionV4 bookCollection = new BookCollectionV4();
        bookCollection.addBook(new Book("Phantom"));
        bookCollection.addBook(new Book("Chacha chowdhury"));
        bookCollection.addBook(new Book("Mandrake"));



        for(int i=0;i<bookCollection.getBooks().size();i++){
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
