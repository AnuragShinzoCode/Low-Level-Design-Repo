package org.example.CollectionsTest;

public class Book extends Items{
    String author;

    Book(int id, String name, Long price, int quantity,String author) {
        super(id, name, price, quantity);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
