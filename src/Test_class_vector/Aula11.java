package Test_class_vector;

import Vector_base.Lists;
import Vector_base.VectorObject;

import java.util.List;

public class Aula11 {
    public static void main(String[] args) {

        Lists<String> list = new Lists<>(1);

        list.add("t");
        list.add("Prova");

        System.out.println(list);

        VectorObject vector = new VectorObject(3);

        Contact c1 = new Contact("Contato 1", "0282-4213", "etests.@gmail.com");
        Contact c2 = new Contact("Contato 2", "6546-4213", "hjvgh.@gmail.com");
        Contact c3 = new Contact("Contato 3", "3312-4213", "tasd.@gmail.com");

        vector.add(c1);

        System.out.println(vector);
    }
}
