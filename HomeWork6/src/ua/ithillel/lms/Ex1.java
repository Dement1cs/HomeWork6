package ua.ithillel.lms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex1 {

    public static void main(String[] args) {

        String[] fruit = new String[10];
        fruit[0] = "арбуз";
        fruit[1] = "черешня";
        fruit[2] = "дыня";
        fruit[3] = "персик";
        fruit[4] = "яблоко";
        fruit[5] = "малина";
        fruit[6] = "клубника";
        fruit[7] = "смородина";
        fruit[8] = "апельсин";
        fruit[9] = "груша";

        String[] food = Arrays.copyOf(fruit, fruit.length);
        Stream.of(food).forEach(item -> System.out.println(item));
    }
}
