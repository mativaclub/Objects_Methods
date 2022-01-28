package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Иди туда где страшно",
                new Author("Джим", "Лоулесс"), 2017);
        book1.setYearOfPublication(2020);
        System.out.println(book1);
//        System.out.println("book1.titleOfBook = " + book1.getTitleOfBook());
//        System.out.println("book1.nameOfAuthor = "
//                + book1.getAuthor().getNameOfAuthor() + " "
//                + book1.getAuthor().getSurnameOfAuthor());
//        System.out.println("book1.yearOfPublication = " + book1.getYearOfPublication());


        Book book2 = new Book("Исповедь экономического убийцы",
                new Author("Джон", "Перкинс"), 2018);
        System.out.println(book2);
//        System.out.println("book2.titleOfBook = " + book2.getTitleOfBook());
//        System.out.println("book2.nameOfAuthor = "
//                + book2.getAuthor().getNameOfAuthor() + " "
//                + book2.getAuthor().getSurnameOfAuthor());
//        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());

        Book book3 = new Book("Исповедь экономического убийцы",
                new Author("Джон", "Перкинс"), 2018);
        System.out.println(book3);

        System.out.println(book1.equals(book3));
        System.out.println(book2.equals(book3));
    }
}



