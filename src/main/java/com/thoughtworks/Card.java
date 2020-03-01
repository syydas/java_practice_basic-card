package com.thoughtworks;

public class Card {
    private final Suit[] suits = {Suit.SPADE, Suit.HEART, Suit.CLUB, Suit.DIAMOND};
    private final String[] point = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Suit[] getSuits() {
        return suits;
    }

    public String[] getPoint() {
        return point;
    }
}
