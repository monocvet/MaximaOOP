package org.example.HomeWork13.task1;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer yearOfPublication;

    public Book() {
    }

    public Book(String title, String author, Integer yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.getTitle()) && author.equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book: " +
                " название: " + title + '\'' +
                ", автор: " + author + '\'' +
                ", год публикации: " + yearOfPublication;
    }
}
