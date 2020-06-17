package com.twschool.practice;

import java.util.List;
import java.util.Scanner;

public class GuessNumberGame {
    private static final int CHANCES = 6;
    private static int USED_CHANCES = 0;
    private static final List<Integer> answer = GeneratorRandomNumber.generateAnswer();;

    public void start() {
        for(int i =0; i < CHANCES; i++) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
        }
    }

    public String getResult() {
        return "";
    }
}
