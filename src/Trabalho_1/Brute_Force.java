package Trabalho_1;

import java.util.ArrayList;

public class Brute_Force {
    ArrayList<String> valuesSearch = new ArrayList<>();

    public void search(String str, String query) { // recebe os valores por para buca de força bruta
        int lengthText = str.length();
        int lengthSearch = query.length();
        for (int i = 0, j = lengthSearch - 1; j < lengthText; ) {

            if (query.equals(str.substring(i, j + 1))) {
               //System.out.printf("Pattern found at index %d,%n", i);
                this.valuesSearch.add( "Pattern found at index "+ i);
            }
            i++;
            j++;
        }
    }

    public ArrayList<String> getValuesSearch() {
        return valuesSearch;
    }

}
