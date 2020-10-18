package phoowichai.phanuwat.q1;

import java.math.*;

/**
 * 
 * Problem 3
 * 
 * Name : Phanuwat Phoowichai
 * St. ID : 623040140-8
 * 
 **/

public class Book {
    private String title;
    private String author;
    private double price;
    private BookGenres genres;
    private static int noOfBook;

    public Book() { // without argument method
        this.title = "No title";
        this.author = "No author";
        this.price = 0.0;
        this.genres = BookGenres.OTHER;
        noOfBook++;
    }

    public Book(String title, String author, double price, BookGenres genres) { // within argument method
        this.title = title;
        this.author = author;
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
        this.genres = genres;
        noOfBook++; // no. of book +1
    }

    public String getTitle() { // getter title of book
        return this.title;
    }

    public void setTitle(String title) { // getter title of book
        this.title = title;
    }

    public String getAuthor() { // getter author of book
        return this.author;
    }

    public void setAuthor(String author) { // setter author of book
        this.author = author;
    }

    public double getPrice() { // getter price of book as 2 decimal
        BigDecimal priceToOutput = BigDecimal.valueOf(this.price);
        priceToOutput = priceToOutput.setScale(2, RoundingMode.HALF_UP);
        return priceToOutput.doubleValue();
    }

    public void setPrice(Double price) { // setter price of book
        if (price < 0.0) { // check price of book is less than 0
            this.price = 0.0; // set 0.0 to default of price
        } else {
            this.price = price;
        }
    }

    public BookGenres getGenres() { // getter genres of book
        return this.genres;
    }

    public void setGenres(BookGenres genres) { // setter genres of book
        this.genres = genres;
    }

    public boolean isCheaper(Book bookN) { // check price of book
        if (this.getPrice() < bookN.getPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public static int getNoOfBook() { // getter no. of book
        return noOfBook;
    }

    @Override
    public String toString() {
        return String.format("Title : " + this.title + ", Author : " + this.author + ", Price : " + getPrice()
                + ", Genres : " + this.genres);
    }
}