package org.example;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен Кинг", 1970, 609);
        Author author2 = new Author("Агата Кристи", 1964, 42);
        Author author3 = new Author("Оскар Уальд", 1978, 66);
        Author author4 = new Author("Русь Матушка", 1945, 222);
        Book book1 = new Book(author1, "Куджо", 500, 100, 1980);
        Book book2 = new Book(author2, "Пуля", 1500, 50, 2007);
        Book book3 = new Book(author3, "Портрет Дориана Грея", 499, 250, 1989);
        Book book4 = new Book(author4, "Репка", 201, 35, 1978);
        //System.out.println(author1);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

    }
}
