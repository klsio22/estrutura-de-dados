package Trabalho_1;

public class Indexof {

    public static void main(String[] args) {

        Brute_Force bruteForce = new Brute_Force();

        Rabin_Karp_algorithm algorithm = new Rabin_Karp_algorithm();


        String txt = "AABAACAADAABAABA";
        String pat = "AABA";

    /*

        bruteForce.search(pat, txt);

        for (String srt : bruteForce.getValuesSearch()) {
            System.out.println(srt);
        }
    */


        algorithm.findPattern(pat,txt,1);


    }


}
