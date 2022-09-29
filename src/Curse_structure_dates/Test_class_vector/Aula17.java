package Curse_structure_dates.Test_class_vector;

import Curse_structure_dates.Vector_base.Lists;

public class Aula17 {
    public static void main(String[] args) {
        Lists<String> list = new Lists<>(6);

        list.add("A");
        list.add("B");
        list.add("Z");
        list.add("C");
        list.add("E");


        System.out.println(list);

        list.clear();

        System.out.println(list);

    }
}
