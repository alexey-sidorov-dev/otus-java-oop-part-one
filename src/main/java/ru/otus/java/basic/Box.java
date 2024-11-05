package ru.otus.java.basic;

public class Box {
    private String color;
    private final int size;
    private boolean isOpened;

    public Box(String color, int size) {
        this.color = color;
        this.size = size > 0 ? size : 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }


    public void open() {
        isOpened = true;
    }

    public void close() {
        isOpened = false;
    }

    public void printBoxInfo() {
    }

    public boolean isOpened() {
        return isOpened;
    }
}
