package ua.ithillel.lms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex1 {

    public static void main(String[] args) {

        String[] fruit = new String[10];
        fruit[0] = "�����";
        fruit[1] = "�������";
        fruit[2] = "����";
        fruit[3] = "������";
        fruit[4] = "������";
        fruit[5] = "������";
        fruit[6] = "��������";
        fruit[7] = "���������";
        fruit[8] = "��������";
        fruit[9] = "�����";

        String[] food = Arrays.copyOf(fruit, fruit.length);
        Stream.of(food).forEach(item -> System.out.println(item));
    }
}
