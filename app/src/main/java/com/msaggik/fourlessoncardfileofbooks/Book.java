package com.msaggik.fourlessoncardfileofbooks;

// сущность книги
public class Book{
    // поля
    private int id;
    private String name;
    private String author;

    // конструктор
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
