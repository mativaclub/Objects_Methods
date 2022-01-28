package ru.skypro;

import java.util.Objects;

public class Author {

    private final String nameOfAuthor;
    private final String surnameOfAuthor;

    @Override
    public String toString() {
        return "Name Of Author - " + nameOfAuthor + "; " + "Surname Of Author - " +
                surnameOfAuthor + "; ";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return nameOfAuthor.equals(author.nameOfAuthor)
                && surnameOfAuthor.equals(author.surnameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, surnameOfAuthor);
    }

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return this.surnameOfAuthor;


    }
}
