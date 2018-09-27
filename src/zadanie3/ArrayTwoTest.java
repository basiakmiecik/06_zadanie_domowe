package zadanie3;

import java.util.Random;

public class ArrayTwoTest {
    public static void main(String[] args) {
        int n=10;
        int m=15;
        int tab[][]= new int [n][m];
        int tab2[][]=new int [n][m];
        int tab3[][]=new int [n][m];
        Random rand=new Random();

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                tab[i][j] = rand.nextInt(10);
                tab2[i][j] = rand.nextInt(20);
                tab3[i][j] = tab[i][j];
            }
        }

        ArrayComparator arrayComparator=new ArrayComparator();

        System.out.println("Tabele są identyczne: "+arrayComparator.compare(tab,tab2));
        System.out.println("Tabele są identyczne: "+arrayComparator.compare(tab,tab3));


    }
}
