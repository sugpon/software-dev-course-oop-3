package org.example;

public class LibraryItem {
    protected String title;
    protected int year;
    protected String author;

    public LibraryItem(String title, int year, String author){
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return "Item: " + title + " by " + author + " (" + year + ")";
    }
}
