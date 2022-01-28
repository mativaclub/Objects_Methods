package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Иди туда где страшно",
                new Author("Джим", "Лоулесс"), 2017);
        book1.setYearOfPublication(2020);
        System.out.println(book1);

        Book book2 = new Book("Исповедь экономического убийцы",
                new Author("Джон", "Перкинс"), 2018);
        System.out.println(book2);


        Book book3 = new Book("Исповедь экономического убийцы",
                new Author("Джон", "Перкинс"), 2018);
        System.out.println(book3);

        System.out.println(book1.equals(book3));
        System.out.println(book2.equals(book3));

        System.out.println(new Author("John", "Perkins").hashCode());
        System.out.println(new Book("Исповедь экономического убийцы",
                new Author("John", "Perkins"),
                2018).hashCode());
    }
}



