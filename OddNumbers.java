public class OddNumbers {

private static final int MININT = 1;

private static final int MAXINT = 99;

    public static void main(String[] args) {

       

        for (int i = MININT; i <= MAXINT; i++) {

            if (i % 2 == 1) {

                System.out.println(i);

            }

        }

    }

}