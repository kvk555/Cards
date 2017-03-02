package com.park;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 28.02.2017.
 */
public class CardHelper {

    public static HashMap<String, ArrayList<Card>> listPacks = new HashMap<>();    //контейнер для всех созданных колод
    public static int count;                                                       //счетчик-регистратор созданных колод

    //виды карт
    public final static String PLAYING_CARDS = "игральные карты";
    public final static String TARO = "таро";
    public final static String HEARTHSTONE = "hearthstone";
    public final static String GWINT = "гвинт";

    //достоинства игральных карт (SimpleCard)
    public final static String HEARTS = "черви";
    public final static String SPADES = "пики";
    public final static String DIAMONDS = "бубны";
    public final static String CLUBS = "трефы";

    //достоинства игральных карт и Таро
    public final static String TWO = "двойка";
    public final static String THREE = "тройка";
    public final static String FOUR = "четверка";
    public final static String FIVE = "пятерка";
    public final static String SIX = "шестерка";
    public final static String SEVEN = "семерка";
    public final static String EIGHT = "восьмерка";
    public final static String NINE = "девятка";
    public final static String TEN = "десятка";
    public final static String JACK = "валет";
    public final static String QUEEN = "дама";
    public final static String KING = "король";
    public final static String ACE = "туз";

    public final static String[] SUIT = {HEARTS, SPADES, DIAMONDS, CLUBS};
    public final static String[] RANK = {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};

    //названия козырей Таро
    public final static String FOOL = "шут";
    public final static String MAGICIAN = "маг";
    public final static String PRIESTESS = "жрица";
    public final static String EMPRESS = "императрица";
    public final static String EMPEROR = "император";
    public final static String POPE = "иерофант";
    public final static String LOVERS = "влюблённые";
    public final static String CHARIOT = "колесница";
    public final static String JUSTICE = "справедливость";
    public final static String HERMIT = "отшельник";
    public final static String WHEEL_FORTUNE = "колесо Фортуны";
    public final static String FORCE = "сила";
    public final static String HANGED_MAN = "повешенный";
    public final static String DEATH = "смерть";
    public final static String TEMPERANCE = "умеренность";
    public final static String DEVIL = "дьявол";
    public final static String TOWER = "башня";
    public final static String STAR = "звезда";
    public final static String MOON = "луна";
    public final static String SUN = "солнце";
    public final static String JUDGEMENT = "суд";
    public final static String WORLD = "мир";

    public final static String[] TRUMPS_TARO = {FOOL, MAGICIAN, PRIESTESS, EMPRESS, EMPEROR, POPE, LOVERS, CHARIOT, JUSTICE,
            HERMIT, WHEEL_FORTUNE, FORCE, HANGED_MAN, DEATH, TEMPERANCE, DEVIL, TOWER, STAR, MOON, SUN, JUDGEMENT, WORLD};

    //масти таро
    public final static String WANDS = "ЖЕЗЛЫ";
    public final static String SWORDS = "МЕЧИ";
    public final static String CUPS = "КУБКИ";
    public final static String COINS = "МОНЕТЫ";
    public final static String[] SUIT_TARO = {WANDS, SWORDS, CUPS, COINS};

    //достоинства таро + см. достоиства игральных карт
    public final static String PRINCE = "принц";
    public final static String[] RANK_TARO = {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, PRINCE, QUEEN, KING};

    //стоимости гвинт
    public final static String WORTH_WHITE = "белый";
    public final static String WORTH_BLUE = "синий";
    public final static String WORTH_PURPLE = "фиолетовый";
    public final static String WORTH_ORANGE = "оранжевый";
    public final static String[] WORTH_GWINT = {WORTH_WHITE, WORTH_BLUE, WORTH_PURPLE, WORTH_ORANGE};

    // показать список всех созданных колод
    public static void getPacksList() {
        for (Map.Entry<String, ArrayList<Card>> pair : listPacks.entrySet()) {
            String key = pair.getKey();
            System.out.println(key + " колода");
        }
    }

    // показать случайную карту из выбранной колоды
    public static void showRandomCard(String namePack) {
        if (listPacks.containsKey(namePack))
            if (listPacks.get(namePack).size() == 0) {
                System.out.println("Колода пуста");
            } else {
                int randomCard = (int) (Math.random() * listPacks.get(namePack).size());
                System.out.println(listPacks.get(namePack).get(randomCard).showCard());
            }
        else {
            System.out.println("Неверное название колоды");
        }
    }

    // показать выбранную игроком карту (в выбранной колоде)
    public static void showSelectedCard(String namePack, int cardNumber) {
        if (listPacks.containsKey(namePack))
            if (listPacks.get(namePack).size() == 0) {
                System.out.println("Колода пуста");
            } else {
                if (cardNumber < 0 || cardNumber > listPacks.get(namePack).size() - 1) {
                    System.out.println("Выберите другую карту!");
                } else {
                    System.out.println(listPacks.get(namePack).get(cardNumber).showCard());
                }
            }
        else {
            System.out.println("Неверное название колоды");
        }
    }

    // показать все карты выбранной колоды
    public static void showPack(String namePack) {
        if (listPacks.containsKey(namePack)) {
            for (Card card : listPacks.get(namePack)) {
                System.out.println(card.showCard());
            }
        } else {
            System.out.println("Неверное название колоды");
        }
    }

    // добавить карту в указанную колоду (перед этим игрок должен выбрать эту карту из другой колоды такого же вида)
    public static void takeAndAdd(String namePackOut, int numberCard, String namePackIn) {
        if (listPacks.containsKey(namePackOut)) {
            if (numberCard >= 0 && numberCard < listPacks.get(namePackOut).size()) {
                if ((listPacks.containsKey(namePackIn)) && namePackOut.substring(4).endsWith(namePackIn.substring(4))) {
                    listPacks.get(namePackIn).add(listPacks.get(namePackOut).get(numberCard));
                    System.out.println("Карта " + listPacks.get(namePackOut).get(numberCard).showCard() + " добавлена в колоду - " + namePackIn);
                    if (listPacks.get(namePackOut).get(numberCard) != null) {
                        listPacks.get(namePackOut).remove(numberCard);
                        System.out.println("Карта удалена из колоды - " + namePackOut);
                    } else {
                        System.out.println("Карта из колоды не удалена");
                    }
                } else {
                    System.out.println("Такой колоды не существует или неверно выбрана колода для перемещения");
                }
            } else {
                System.out.println("Неверный номер карты!");
            }
        } else {
            System.out.println("Неверное название колоды");
        }
    }
}



