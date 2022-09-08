package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] args) {
        Author author=new Author("Maksim", "gorkyMaks28@gamil.com", 'M');
        System.out.println(author.getName()+" "+author.getEmail());
        author.setEmail("Maksgor21@yandex.ru");
        System.out.println(author.getGender());
        System.out.println(author.toString());
    }
}
