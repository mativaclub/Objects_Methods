package ru.skypro;

import java.util.Objects;

public class Book {

    private final String titleOfBook;
    private final Author author;
    private int yearOfPublication;

    @Override
    public String toString() {
        return "Title Of Book - " + titleOfBook + "; " + author + "Year Of Publication - "
                + yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return titleOfBook.equals(book.titleOfBook)
                && author.equals(book.author)
                && yearOfPublication == (book.yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfBook, author, yearOfPublication);
    }

    public Book(String titleOfBook, Author author, int yearOfPublication) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleOfBook() {
        return this.titleOfBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    }

