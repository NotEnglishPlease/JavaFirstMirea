package ru.mirea.task2;

public class Book {
    int pagesNum;
    String name, genre, publisher;

    public Book (String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pagesNum=" + pagesNum +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public void setPublishHouse(String publisher) {
        this.publisher = publisher;
    }

    public void setPagesNum() {
        if (publisher == "ACT") this.pagesNum = 300; // рассчет количества страниц в завизимости от издательства
        else this.pagesNum = 500;
    }
}
