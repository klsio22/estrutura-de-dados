package Curse_structure_dates.Test_class_vector;

import Curse_structure_dates.Vector_base.VectorObject;

public class Aula10 {
    public static void main(String[] args) {

        VectorObject vector = new VectorObject(3);

        Contact c1 = new Contact("Contato 1", "0282-4213", "etests.@gmail.com");
        Contact c2 = new Contact("Contato 2", "6546-4213", "hjvgh.@gmail.com");
        Contact c3 = new Contact("Contato 3", "3312-4213", "tasd.@gmail.com");

        Contact c4 = new Contact("Contato 4", "3312-4213", "tasd.@gmail.com");

        System.out.println("Tamanho = " + vector.size());

        vector.add(c1);
        vector.add(c2);
        vector.add(c3);

        int pos = vector.search(c4);
        if(pos> -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vector);
    }
}
