package com.twschool.practice;

public class Main {
    public static  void main(String[] args) {
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        guessNumberGame.start();
        System.out.println(guessNumberGame.getResult());
    }
}
