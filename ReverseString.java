public class ReverseString {

    private static String reverseString(String s) {
        int middleIndex = s.length()/2;
        char[] charsArr = s.toCharArray();

        for (int i = 0; i < middleIndex; i++) {
            char t = charsArr[i];
            charsArr[i] = charsArr[s.length() - i - 1];
            charsArr[s.length() - i - 1] = t;
        }

        return new String(charsArr);
    }

    public static void main(String[] args) {
        System.out.printf("Argument String: %s\n", args[0]);
        System.out.printf("Reversed String: %s\n", reverseString(args[0]));
    }
}
