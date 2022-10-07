package Curse_structure_dates.Test_class_vector;

import Curse_structure_dates.Vector_base.Lists;

public class Aula14 {
    public static void main(String[] args) {
        Lists<String> list = new Lists<>(6);

        list.add("A");
        list.add("B");
        list.add("Z");
        list.add("C");
        list.add("Z");

        System.out.println(list.lastIndex("Z"));

    }
}
