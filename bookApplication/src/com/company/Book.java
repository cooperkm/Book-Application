package com.company;

public abstract class Book {


    private String title;
    private Double price;


    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }


    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public abstract void setPrice(Double price);


    @Override
    public String toString() {
        return title + "---------" + price;

    }

}