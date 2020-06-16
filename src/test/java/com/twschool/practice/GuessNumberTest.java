package com.twschool.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    @Test
     public void should_return_1A0B_1_correct_when_given_answer_1_2_3_4_and_input_1_5_6_7() {
        //given
        List<String> answer = Arrays.asList("1","2","3","4");
        List<String> input = Arrays.asList("1 5 6 7".split(" "));
        AnswerCheckTool answerCheckTool = new AnswerCheckTool(answer, input);

        //when
        String result = answerCheckTool.printResult();

        //then
        assertEquals("1A0B", result);
    }

    @Test
    public void should_return_0A2B_1_correct_when_given_answer_1_2_3_4_and_input_2_4_7_8() {
        //given
        List<String> answer = Arrays.asList("1","2","3","4");
        List<String> input = Arrays.asList("2 4 7 8".split(" "));
        AnswerCheckTool answerCheckTool = new AnswerCheckTool(answer, input);

        //when
        String result = answerCheckTool.printResult();

        //then
        assertEquals("0A2B", result);
    }

    @Test
    public void should_return_1A2B_1_correct_when_given_answer_1_2_3_4_and_input_0_3_2_4() {
        //given
        List<String> answer = Arrays.asList("1","2","3","4");
        List<String> input = Arrays.asList("0 3 2 4".split(" "));
        AnswerCheckTool answerCheckTool = new AnswerCheckTool(answer, input);

        //when
        String result = answerCheckTool.printResult();

        //then
        assertEquals("1A2B", result);
    }


    @Test
    public void should_return_0A0B_1_correct_when_given_answer_1_2_3_4_and_input_5_6_7_8() {
        //given
        List<String> answer = Arrays.asList("1","2","3","4");
        List<String> input = Arrays.asList("5 6 7 8".split(" "));
        AnswerCheckTool answerCheckTool = new AnswerCheckTool(answer, input);

        //when
        String result = answerCheckTool.printResult();

        //then
        assertEquals("0A0B", result);
    }


    @Test
    public void should_return_0A4B_1_correct_when_given_answer_1_2_3_4_and_input_4_3_2_1() {
        //given
        List<String> answer = Arrays.asList("1","2","3","4");
        List<String> input = Arrays.asList("4 3 2 1".split(" "));
        AnswerCheckTool answerCheckTool = new AnswerCheckTool(answer, input);

        //when
        String result = answerCheckTool.printResult();

        //then
        assertEquals("0A4B", result);
    }

    @Test
    public void should_return_4A0B_1_correct_when_given_answer_1_2_3_4_and_input_1_2_3_4() {
        //given
        List<String> answer = Arrays.asList("1","2","3","4");
        List<String> input = Arrays.asList("1 2 3 4".split(" "));
        AnswerCheckTool answerCheckTool = new AnswerCheckTool(answer, input);

        //when
        String result = answerCheckTool.printResult();

        //then
        assertEquals("4A0B", result);
    }

}
