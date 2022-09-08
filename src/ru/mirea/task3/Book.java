package ru.mirea.task3;

public class Book {
    private String Author;
    private String Title;
    private int Year;
    private int numOfPages;

    public Book(){
        Author=null;
        Title=null;
        Year=0;
        numOfPages=0;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getYear() {
        return Year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", Year=" + Year +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
