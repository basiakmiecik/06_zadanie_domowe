package zadanie4;

import zadanie4.MultiArray;

public class MultiArrayTest {
    public static void main(String[] args) {

        MultiArray multiArray=new MultiArray(6,5);
        multiArray.print();
        System.out.println("\nMax: "+ multiArray.findMax());
        System.out.println("Min: "+multiArray.findMin());
        System.out.println("\nPonowne randomizowanie: ");
        multiArray.randomize();
        multiArray.print();
    }
}
