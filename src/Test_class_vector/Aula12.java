package Test_class_vector;

import java.util.ArrayList;
import java.util.LinkedList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("c");
        System.out.println(arrayList);

        arrayList.add(1, "b");

        System.out.println(arrayList);

        boolean exist  = arrayList.contains("A");
        System.out.println(exist);

        int pos = arrayList.indexOf("B");

        System.out.println("Posição do elemento caso exista ou não : " + pos);

        System.out.println("Busca elemento pela posição: "+arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("b");

        System.out.println(arrayList);

        System.out.println(arrayList.size());
    }
}
