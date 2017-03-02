package com.park;

/**
 * Created by user on 01.03.2017.
 * Класс для создания изображений на картах. Имеют цвет и условный ID.
 */
public class Picture {

    private int color;
    private int id;

    public Picture(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
