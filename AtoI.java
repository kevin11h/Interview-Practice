public class AtoI {

    public static int convert(char[] chars) {
        int result = 0;

        for (int i = 0, place = 0; i < chars.length; i++, place++) {
            int anInt = Character.getNumericValue(chars[chars.length-i-1]);
            result += anInt * (Math.pow(10, place));
        }

        return result;
    }

    public static void main (String[] args) {
        char[] oneToFive = {'1','2','3','4','5'};
        System.out.printf("atoi([1, 2, 3, 4, 5]) -> %d", convert(oneToFive));
    }
}
