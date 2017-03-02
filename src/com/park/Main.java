package com.park;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        CommonPack taro = new TaroCardPack();
        CommonPack gwint = new GwintCardPack();
        CommonPack hearstone = new HearthstoneCardPack();
        CommonPack simpleCard = new SimpleCardPack();

        taro.createPack();
        taro.createPack();
        gwint.createPack();
        gwint.createPack();
        hearstone.createPack();
        hearstone.createPack();
        simpleCard.createPack();
        Collections.shuffle(simpleCard.createPack());  // создаем колоду и сразу ее перетасовываем

        CardHelper.getPacksList();    //получаем список существующих колод
        CardHelper.takeAndAdd("1-таро", 5, "2-таро");   // добавляем пятую карту из колоды "1-таро" в колоду "2-таро"
        CardHelper.showSelectedCard("3-гвинт", 8);      // смотрим восьмую карту в колоде "3-гвинт"
        CardHelper.showRandomCard("7-игральные карты"); // сморим случайную карту в колоде "7-игральные карты"
        CardHelper.showPack("8-игральные карты");       //смотрим все карты в выбранной колоде
    }
}
