package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {

        Book book=new Book();
        book.setAuthor("Грибоедов");
        book.setTitle("Горе от ума");
        book.setYear(1825);
        book.setNumOfPages(392);
        System.out.println(book);
    }
}
