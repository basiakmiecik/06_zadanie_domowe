package zadanie4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MultiArray {
    private int[][] tab;
    Random rand = new Random();

    public MultiArray(int N, int M) {
        this.tab = new int[N][M];
        for (int j = 0; j < M; j++) {
            for (int i = 0; i <N; i++) {
                tab[i][j] = rand.nextInt(100);
            }
        }


    }

    public void randomize() {
        for (int j = 0; j < tab[j].length; j++) {
            for (int i = 0; i < tab.length; i++) {
                tab[i][j] = rand.nextInt(100);
            }
        }
    }

    public int findMax() {
        int max = 0;
        for (int j = 0; j < tab[j].length; j++) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i][j] > max) {
                    max=tab[i][j];
                }
            }
        }
        return max;
    }

    public int findMin() {
        int min = 100;
        for (int j = 0; j < tab[j].length; j++) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i][j] < min) {
                    min= tab[i][j];
                }
            }
        }

        return min;
    }

    public void print() {
        for (int i = 0; i < tab.length; i++) {
            String arrayString = Arrays.toString(tab[i]);
            System.out.println(arrayString);
        }
    }
}
