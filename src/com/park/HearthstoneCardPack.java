package com.park;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 01.03.2017.
 * Класс для создания колоды Hearthstone
 * В обычной колоде Hearthstone 30 карт. Карта Hearthstone содержит уникальное изображение, показатели от 0 до 12 атаки,
 * защиты и стоимости.
 */
public class HearthstoneCardPack implements CommonPack {
    private ArrayList<Card> packHearthstone;
    private final int amountCard = 30;
    private final int maxValue = 11;      //максимальная величина показателей для генерации случайных значений

    @Override
    public ArrayList<Card> createPack() {
        packHearthstone = new ArrayList<>();
        for (int i = 0; i < amountCard; i++) {
            int randomAttack = (int) (Math.random() * maxValue);    //генеруем покзатель атаки
            int randomDefense = (int) (Math.random() * maxValue);   //генеруем покзатель защиты
            int randomWorth = (int) (Math.random() * maxValue);     //генеруем покзатель стоимости
            packHearthstone.add(new HearthstoneCard(new Picture(i), randomAttack, randomDefense, randomWorth)); // создаем и добавляем карту в колоду
        }
        CardHelper.count++;                 // регистирируем колоду в общем списке колод
        String key = CardHelper.count + "-" + CardHelper.HEARTHSTONE;          // присваиваем колоде свой уникальный ключ

        CardHelper.listPacks.put(key, packHearthstone);     // помещаем колоду в общий контейнер для хранения созданных колод
        return packHearthstone;
    }
}

