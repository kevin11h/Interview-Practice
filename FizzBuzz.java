public class FizzBuzz {

private static final int SIZE = 100;

    public static void main(String[] args) {

       

        for (int i = 1; i < SIZE+1; i++) {

            System.out.printf("%d ", i);

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");

            }

            else if (i % 3 == 0) {

                System.out.println("Fizz");

            }

            else if (i % 5 == 0) {

                System.out.println("Buzz");

            }
            else {
                System.out.println();
            }

        }

    }

}