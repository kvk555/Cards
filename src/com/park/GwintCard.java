package com.park;

/**
 * Created by user on 01.03.2017.
 *    Карта Gwint содержит уникальное изображение, показатель силы (от 0 до 12), описание способности (уникальный текст)
 *    и стоимость (в виде обозначения четырех цветов (белый, синий, фиолетовый,оранжевый))
 */
public class GwintCard implements Card {

    private Picture picture;
    private int strong;
    private String ability;
    private String worth;

    public GwintCard(Picture picture, int strong, String ability, String worth) {
        this.picture = picture;
        this.strong = strong;
        this.ability = ability;
        this.worth = worth;
    }

    public int getPicture() {
        return picture.getId();
    }


    public int getStrong() {
        return strong;
    }

    public String getAbility() {
        return ability;
    }

    public String getWorth() {
        return worth;
    }

    /* При демонстрации карты показываем изображение на ней (условно ID), показатель
    силы, описание способности и стоимость (цвет) */

    @Override
    public String showCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("id gwint picture#").append(this.getPicture()).append(" - сила: ").append(this.getStrong())
                .append(", способность: ").append(this.getAbility()).append(", стоимость: ").append(this.getWorth());

        return sb.toString();
    }
}

