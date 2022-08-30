package Test_class_vector;

import Vector_base.Vector;

public class Aula06 {
    public static void main(String[] args) {
        Vector vector = new Vector(10);

        vector.add("Elemeto 1");
        vector.add("Elemeto 2");
        vector.add("Elemeto 3");
        System.out.println(vector.search("Elemeto 2"));
        System.out.println(vector.search("elemeto 1"));
        System.out.println(vector.search("dsada 1"));

    }
}
