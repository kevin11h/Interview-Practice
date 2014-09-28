public class FormatRGB {

    private static char[] hexSymbols = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    public static String format(int r, int g, int b) {

        return toHex(r) + toHex(g) + toHex(b);

    }

    public static String toHex(int c) {

        StringBuilder sb = new StringBuilder();

        int quotient = c;
        int remainder = c;

        while (quotient > 0) {
            remainder = quotient % hexSymbols.length;
            quotient = quotient / hexSymbols.length;
            sb.insert(0, hexSymbols[remainder]);
        }

        //sb.insert(0, hexSymbols[remainder]);

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(format(255, 0, 128));
        System.out.println(format(32, 0, 16));
    }
}