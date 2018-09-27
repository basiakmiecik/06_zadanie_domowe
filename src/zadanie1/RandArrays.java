package zadanie1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandArrays {
    public static void main(String[] args) {
        int n = 10;
        int tab[] = new int[2 * n];
        int j = 19;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(10);
            tab[j] = tab[i];
            j -= 1;
        }
        String stringArray = Arrays.toString(tab);
        System.out.println(stringArray);
    }
}

