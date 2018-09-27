package zadanie3;

public class ArrayComparator {
    public boolean compare(int array[], int array2[]) {
        boolean result = true;
        if (array.length != array2.length) {
            result = false;
        } else {
            for (int i = 0; i < array.length; i++) {

                if (array[i] != array2[i]) {
                    result = false;
                }

            }
        }

        return result;
    }

    public boolean compare(int array[][], int array2[][]) {
        boolean result = true;
        if (array.length != array2.length) {
            result = false;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != array2[i].length) {
                    result = false;
                } else {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] != array2[i][j]) {
                            result = false;
                        }
                    }
                }
            }
        }
        return result;
    }


}
