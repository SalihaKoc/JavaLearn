package javaForLife.InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class q18 {

    /*
    Given a list of people names: "Ahmed", "John", "Eric",
    "Ahmed"...
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(List.of("Ahmed", "John", "Eric", "John"));

        list.removeIf(s->s.equalsIgnoreCase("John"));

    }

}
