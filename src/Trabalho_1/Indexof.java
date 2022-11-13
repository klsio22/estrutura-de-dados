package Trabalho_1;

public class Indexof {

    public static void main(String[] args) {

        Brute_Force bruteForce = new Brute_Force();

        String pat = "um é uma";
        String txt = "um";

        bruteForce.search(pat, txt);

        for (String srt : bruteForce.getValuesSearch()) {
            System.out.println(srt);
        }

    }


}
