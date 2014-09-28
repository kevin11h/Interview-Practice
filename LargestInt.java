import java.util.NoSuchElementException;

public class LargestInt {

private static final int[] array1 = {5,4,3,2,1};

private static final int[] array2 = {5};

private static final int[] array3 = {};

public static int find(int[] array) {

    if (array.length == 0) {

        throw new NoSuchElementException();

    }

    int largest = array[0];

    for (int i = 0 ; i < array.length; i++) {

        if (array[i] > largest) {

            largest = array[i];

        }

    }

    return largest;

}

    public static void main(String[] args) {

       

        System.out.println(find(array1));

        System.out.println(find(array2));

        System.out.println(find(array3));

    }

}