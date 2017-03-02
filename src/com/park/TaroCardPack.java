package com.park;

import java.util.ArrayList;

/**
 * Created by user on 01.03.2017.
 * Класс для создания колоды Таро
 * Колода Таро состоит из 78 карт. 22 карты - "козыри"(старшие арканы) - содеоржат уникальное изображение и название,
 * 56 карт (младшиие арканы) - имеют 4 масти и 14 достоинств каждой масти - содержат уникальное изображение,
 * масть и достоинство
 */
public class TaroCardPack implements CommonPack {

    private ArrayList<Card> packTaro;

    @Override
    public ArrayList<Card> createPack() {
        packTaro = new ArrayList<>();
        int i;                             // используем  таккже как генератор значений для условных ID изображений
        for (i = 0; i < CardHelper.TRUMPS_TARO.length; i++) {    // присваваем козырям названия из имеющегося массива
            packTaro.add(new TaroCard((new Picture(i)), CardHelper.TRUMPS_TARO[i]));   // создаем и добавляем карту в колоду
        }
        for (int j = 0; j < CardHelper.SUIT_TARO.length; j++) {    // назначаем младшим арканам масти из имеющегося массива
            for (int k = 0; k < CardHelper.RANK_TARO.length; k++) {   // назначаем младшим арканам достоинства из имеющегося массив
                packTaro.add(new TaroCard(new Picture(i++), CardHelper.SUIT_TARO[j], CardHelper.RANK_TARO[k])); // создаем и добавляем карту в колоду
            }
        }
        CardHelper.count++;                                         // регистирируем колоду в общем списке колод
        String key = CardHelper.count + "-" + CardHelper.TARO;     // присваиваем колоде свой уникальный ключ

        CardHelper.listPacks.put(key, packTaro);       // помещаем колоду в общий контейнер для хранения созданных колод
        return packTaro;
    }
}
