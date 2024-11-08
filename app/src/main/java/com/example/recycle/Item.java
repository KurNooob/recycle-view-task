package com.example.recycle;

public class Item {
    private String title;
    private int imageResource;

    public Item(String title, int imageResource) {
        this.title = title;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }
}