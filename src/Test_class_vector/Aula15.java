package Test_class_vector;

import Vector_base.Lists;

public class Aula15 {
    public static void main(String[] args) {

        Lists<String> list = new Lists<>(6);

        list.add("A");
        list.add("B");
        list.add("Z");
        list.add("C");
        list.add("Z");


        System.out.println(list);

        list.remove("A");

        System.out.println(list);

        list.remove("Z");

        System.out.println(list);
    }
}
