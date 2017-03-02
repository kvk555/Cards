package com.park;

import java.util.ArrayList;

/**
 * Created by user on 01.03.2017.
 * Класс для создания колоды карт Gwint
 * В обычной колоде Gwint 40 карт. Каждая карта содержит описание силы, способности и стоимости.
 */
public class GwintCardPack implements CommonPack {

    private ArrayList<Card> packGwint;
    private final int amountCard = 40;     // количество карт в колоде
    private final int maxStrong = 13;      // показатель силы может быть от 0 до 12
    private final int amountWorth = 4;     // имеется 4 показателя стоимости (белый, синий, фиоллетовый, оранжевый)

    @Override
    public ArrayList<Card> createPack() {
        packGwint = new ArrayList<>();
        for (int i = 0; i < amountCard; i++) {
            String abilityText = "sometext " + i;                      // генерируем уникальный текст с описанием способности
            int randomStrong = (int) (Math.random() * maxStrong);      // генерируем показатель силы в пределах 0..12
            int randomWorth = (int) (Math.random() * amountWorth);     // выбираем цвет способности из 4 имеющихся вариантов
            packGwint.add(new GwintCard(new Picture(i), randomStrong, abilityText, CardHelper.WORTH_GWINT[randomWorth]));  // создаем и добавляем карту в колоду
        }
        CardHelper.count++;                                               // регистирируем колоду в общем списке колод
        String key = CardHelper.count + "-" + CardHelper.GWINT;           // присваиваем колоде свой уникальный ключ

        CardHelper.listPacks.put(key, packGwint);     // помещаем колоду в общий контейнер для хранения созданных колод
        return packGwint;
    }
}
