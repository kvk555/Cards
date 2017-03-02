package com.park;

/**
 * Created by user on 28.02.2017.
 * Обычная Игралья карта содержит уникальное изображение, масть и достоинство.
 */
public class SimpleCard implements Card {

    private Picture picture;
    private String rank;
    private String suit;

    public SimpleCard(Picture picture, String rank, String suit) {
        this.picture = picture;
        this.rank = rank;
        this.suit = suit;
    }

    public int getPicture() {
        return picture.getId();
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    //При демонстрации карты показываем изображение на ней (условно ID), масть и достоинство

    @Override
    public String showCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("id игральная карта picture#").append(this.getPicture()).append(" - достоинство: ").append(this.getRank())
                .append(", масть: ").append(this.getSuit());
        return sb.toString();
    }
}
