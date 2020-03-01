package com.thoughtworks;

import java.util.HashSet;
import java.util.Random;

public class CardMachine {
    private Card cards;

    public CardMachine() {
    }

    public CardMachine(Card cards) {
        this.cards = cards;
    }

    public HashSet<String> drawCard(int n) {
        if (n <= 0 || n > 52) {
            System.out.println("out of range!");
            return null;
        }
        HashSet<String> cardMap = new HashSet<>();
        Random r = new Random();
        while (n != cardMap.size()) {
            Suit[] suits = cards.getSuits();
            String[] point = cards.getPoint();
            cardMap.add(suits[r.nextInt(suits.length)].getSuit() + point[r.nextInt(point.length)]);
        }
        return cardMap;
    }
}
