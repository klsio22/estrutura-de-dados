package Trabalho_1;

public class Rabin_Karp_algorithm {

    // numberCharacters is the number of characters in the input alphabet
    public final static int numberCharacters = 256;

    /* pat -> pattern
        txt -> text
        primeNumber -> A prime number
    */
    static void findPattern(String pat, String txt, int primeNumber)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int pattern = 0; // hash value for pattern
        int text = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%primeNumber"
        for (i = 0; i < M - 1; i++)
            h = (h * numberCharacters) % primeNumber;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) {
            pattern = (numberCharacters * pattern + pat.charAt(i)) % primeNumber;
            text = (numberCharacters * text + txt.charAt(i)) % primeNumber;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {

            // Check the hash values of current window of
            // text and pattern. If the hash values match
            // then only check for characters one by one
            if (pattern == text) {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                // if pattern == text and pat[0...M-1] = txt[i, i+1,
                // ...i+M-1]
                if (j == M)
                    System.out.println(
                            "Pattern found at index " + i);
            }

            // Calculate hash value for next window of text:
            // Remove leading digit, add trailing digit
            if (i < N - M) {
                text = (numberCharacters * (text - txt.charAt(i) * h)
                        + txt.charAt(i + M))
                        % primeNumber;

                // We might get negative value of text,
                // converting it to positive
                if (text < 0)
                    text = (text + primeNumber);
            }
        }
    }

}
