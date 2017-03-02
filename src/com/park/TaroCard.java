package com.park;

/**
 * Created by user on 01.03.2017.
 * Колода Таро состоит из 78 карт. 22 карты - "козыри"(старшие арканы) - содеоржат уникальное изображение и название,
 * 56 карт (младшиие арканы) - имеют 4 масти и 14 достоинств каждой масти - содержат уникальное изображение,
 * масть и достоинство
 */
public class TaroCard implements Card {

    private Picture picture;
    private String trump;        //назвние казыря
    private String suit;         //назваание масти
    private String rank;         // достоинство

    public TaroCard(Picture picture, String trump) {      //конструктор для карты "козырь"
        this.picture = picture;
        this.trump = trump;
    }

    public TaroCard(Picture picture, String suit, String rank) {         //конструктор для карты из младшего аркана
        this.picture = picture;
        this.suit = suit;
        this.rank = rank;
    }

    public int getPicture() {
        return picture.getId();
    }

    public String getTrump() {
        return trump;
    }

    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }

    /* При демонстрации карты "козыря" показываем изображение на ней (условно ID) и его название,
     при демонстрации карты младшего акркана показываем изображение, масть и достоинство*/
    @Override
    public String showCard() {
        StringBuilder sb = new StringBuilder();
        if (this.trump != null) {
            sb.append("id taro picture#").append(this.getPicture()).append(" - ").append(this.getTrump());
        } else {
            sb.append("id taro picture#").append(this.getPicture()).append(" - ").append(this.getSuit()).append(" ").append(this.getRank());
        }
        return sb.toString();
    }
}

