package Test_class_vector;

import Vector_base.Vector;

public class Aula09 {
    public static void main(String[] args) {

        Vector vector = new Vector(3);

        vector.add("B");
        vector.add("C");
        vector.add("E");
        vector.add("F");
        vector.add("G");

        System.out.println(vector);
        vector.remove(3);

        System.out.println(vector);

        int pos = vector.search("L");
        if(pos > -1){
           vector.remove(pos);
        }else {
            System.out.println("Elemento não existe");
        }

        System.out.println(vector);

    }
}
