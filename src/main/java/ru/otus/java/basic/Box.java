package ru.otus.java.basic;

import com.google.common.base.Joiner;

public class Box {
    private String color;
    private final int size;
    private boolean isOpened;
    private String item;

    public Box(String color, int size) {
        this.color = color;
        this.size = Math.abs(size);
        this.isOpened = false;
        printInfo();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробку покрасили в " + color);
    }

    public int getSize() {
        return size;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void open() {
        isOpened = true;
        System.out.println("Коробку открыли");
    }

    public void close() {
        isOpened = false;
        System.out.println("Коробку закрыли");
    }

    public String getItem() {
        return item;
    }

    public void printInfo() {
        Joiner joiner = Joiner.on("; ");
        System.out.println(joiner.join("Информация о коробке\n" +
                        "Размер: " + size,
                "Цвет: " + color,
                "Состояние: " + (isOpened ? "открыта" : "закрыта"),
                "Предмет: " + (item == null ? "отсутствует" : item)));
    }

    public void putItem(String item) {
        if (!isOpened) {
            System.out.println("Коробка закрыта, невозможно положить " + item);
            return;
        }
        if (this.item != null) {
            System.out.println("Коробка заполнена, невозможно положить " + item);
            return;
        }

        System.out.println("В коробку положили " + item);
        this.item = item;
    }

    public void dropItem() {
        if (!isOpened) {
            System.out.println("Коробка закрыта, невозможно выкинуть " + this.item);
            return;
        }
        if (this.item == null) {
            System.out.println("Коробка пустая, невозможно выкинуть предмет");
        }

        System.out.println("Из коробки выкинули " + this.item);
        this.item = null;
    }
}
