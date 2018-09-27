package zadanie3;

import java.util.Random;
import zadanie3.ArrayComparator;

public class ArrayTest {
    public static void main(String[] args) {
        int n=10;
        int tab[]= new int [n];
        int tab2[]=new int [n];
        int tab3[]=new int [n];
        Random rand=new Random();

        for(int i=0;i<n;i++){
            tab[i]=rand.nextInt(10);
            tab2[i]=rand.nextInt(20);
            tab3[i]=tab[i];
        }

        ArrayComparator arrayComparator=new ArrayComparator();

        System.out.println("Tabele są identyczne: "+arrayComparator.compare(tab,tab2));
        System.out.println("Tabele są identyczne: "+arrayComparator.compare(tab,tab3));
    }
}
