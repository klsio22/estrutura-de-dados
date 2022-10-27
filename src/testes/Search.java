package testes;

public class Search {

    public void search(String str, String query) {
        int lengthText = str.length();
        int lengthSearch = query.length();
        for (int i = 0, j = lengthSearch - 1; j < lengthText; ) {

            if (query.equals(str.substring(i, j + 1))) {
                System.out.printf("Pattern found at index %d,%n", i);
            }
            i++;
            j++;
        }

    }

}
