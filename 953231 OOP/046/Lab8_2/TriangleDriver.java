package Lab8_2;

public class TriangleDriver {
    public static void main(String[] args) {
        Triangle r = new Triangle(4, 4, 8);
        System.out.println(r);
        try {
            Triangle t = new Triangle(4, 4, 9);
            System.out.println(t);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println(hex2Dec("4f"));
        System.out.println(hex2Dec("000000G"));

    }

    private static long hex2Dec(String hexString) {
        long out = 0;
        hexString = hexString.toLowerCase();
        int len = hexString.length();
        for (int i = 0; i < len; i++) {
            char curr = hexString.charAt(i);
            if ((curr >= '0' && curr <= '9') || (curr >= 'a' && curr <= 'f')) {
                out += (curr - (curr < 'a' ? '0' : 'a' - 10)) * Math.pow(16, len - i - 1);
            } else
                throw new NumberFormatException("Invalid Hexadecimal String");
        }
        return out;
    }
}
