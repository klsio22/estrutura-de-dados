package vectors_and_arrays;

public class Main {
    public static void main(String[] args) {
        double[] temperatures = new double[365];
        int day = 1;
        temperatures[0] = 21.3;
        temperatures[1] = 21.3;
        temperatures[2] = 21.3;
        temperatures[3] = 21.3;
        temperatures[4] = 21.3;
        System.out.printf("O valor de temperatura do dia 3 é: %s%n", temperatures[2]);
        System.out.printf("O tamanho do arry : %s%n", temperatures.length);

        for (int i = 0; i < temperatures.length; i++) {
            // System.out.printf("O valor da temperatura do dia %s%n é  %s%n", (i + 1), temperatures[i]);
        }
        
        for (double temp : temperatures) {

            System.out.printf("O valor da temperatura do dia %s%n é %s%n", day++, temp);
        }
    }
}
