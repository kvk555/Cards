package com.park;

import java.util.ArrayList;

/**
 * Created by user on 28.02.2017.
 * Класс для создания колоды обычных игральных карт
 * В обычной колоде игральных карт 52 карты (4 масти и 13 достоинств каждой масти). Игральная карта содержит уникальное изображение,
 * масть и достоинство
 */
public class SimpleCardPack implements CommonPack {

    private ArrayList<Card> packPlayingCard;

    @Override
    public ArrayList<Card> createPack() {
        packPlayingCard = new ArrayList<>();
        int k = 0;                                                // генератор условных ID изображений
        for (int i = 0; i < CardHelper.SUIT.length; i++) {        //перечисляем масти
            for (int j = 0; j < CardHelper.RANK.length; j++) {    //присваиваем каждой масти список всех достоинств
                packPlayingCard.add(new SimpleCard(new Picture(k++), CardHelper.RANK[j], CardHelper.SUIT[i]));  // создаем и добавляем карту в колоду
            }
        }
        CardHelper.count++;                             // регистирируем колоду в общем списке колод
        String key = CardHelper.count + "-" + CardHelper.PLAYING_CARDS;    // присваиваем колоде свой уникальный ключ

        CardHelper.listPacks.put(key, packPlayingCard);     // помещаем колоду в общий контейнер для хранения созданных колод
        return packPlayingCard;
    }
}


