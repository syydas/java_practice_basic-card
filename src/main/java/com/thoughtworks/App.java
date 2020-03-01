package com.thoughtworks;

import java.util.HashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Card cards = new Card();
        CardMachine machine = new CardMachine(cards);
        System.out.println("请输入想抽取的牌数： ");
        HashSet<String> cardMap = machine.drawCard(new Scanner(System.in).nextInt());
        System.out.println("您抽到的卡为：");
        System.out.println(String.join(" ",cardMap));
    }
}
