package Curse_structure_dates.Test_class_vector;

import Curse_structure_dates.Vector_base.Vector;

public class Aula07 {
    public static void main(String[] args) {

        Vector vector = new Vector(10);

        vector.add("B");
        vector.add("C");
        vector.add("E");
        vector.add("F");
        vector.add("G");

        System.out.println(vector);

        vector.add(0,"A");
        System.out.println(vector);

        vector.add(3,"D");
        System.out.println(vector);



    }
}
