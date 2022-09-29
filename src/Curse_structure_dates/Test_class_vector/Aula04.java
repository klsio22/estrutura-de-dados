package Curse_structure_dates.Test_class_vector;

import Curse_structure_dates.Vector_base.Vector;

public class Aula04 {
    public static void main(String[] args) {
        Vector vector = new Vector(10 );

        vector.add("Elemeto 1");
        vector.add("Elemeto 2");
        vector.add("Elemeto 3");

        System.out.println(vector.size());
        System.out.println(vector);
    }
}
