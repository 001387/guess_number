package com.twschool.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratorRandomNumber {

    public static List<Integer> generateAnswer() {
        List<Integer> answer = new ArrayList<>();
        while(answer.size() < 4)
        {
            int n = new Random().nextInt(10);
            if(!answer.contains(n))
                answer.add(n);//如果n不包涵在list中，才添加
        }
        List<Integer> numberSource = IntStream.rangeClosed(0,9).boxed().collect(Collectors.toList());
        Collections.shuffle(numberSource);
        List<String> numbers = numberSource.stream()
                .limit(4)
                .map(String::valueOf)
                .collect(Collectors.toList());
        return answer;
    }
}
