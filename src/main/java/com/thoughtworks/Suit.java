package com.thoughtworks;

public enum Suit {
    SPADE("黑桃"),
    HEART("红桃"),
    CLUB("梅花"),
    DIAMOND("方片");

    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
