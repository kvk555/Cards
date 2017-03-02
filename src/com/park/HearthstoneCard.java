package com.park;

/**
 * Created by user on 01.03.2017.
 * Карта Hearthstone содержит уникальное изображение, показатели от 0 до 12 атаки, защиты и стоимости.
 */
public class HearthstoneCard implements Card {

    private Picture picture;
    private int attack;
    private int defense;
    private int worth;

    public HearthstoneCard(Picture picture, int attack, int defense, int worth) {
        this.picture = picture;
        this.attack = attack;
        this.defense = defense;
        this.worth = worth;
    }

    public int getPicture() {
        return picture.getId();
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getWorth() {
        return worth;
    }

     /* При демонстрации карты показываем изображение на ней (условно ID), показатель
    атаки, защиты и стоимости*/

    @Override
    public String showCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("id gwint picture#").append(this.getPicture()).append(" - атака: ").append(this.getAttack())
                .append(", защита: ").append(this.getDefense()).append(", стоимость: ").append(this.getWorth());

        return sb.toString();
    }
}
