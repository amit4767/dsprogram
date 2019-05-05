public class BinaryToDecimal {


    private int binToInt(String bin) {

        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= bin.length(); i++) {
            //we need to take last char first
            if (bin.charAt(bin.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        return result;
    }

    private int binToIntAlt(String bin) {

        int result = 0;

        for (int i = 1; i <= bin.length(); i++) {
            //we need to take last char first
            if (bin.charAt(bin.length() - i) == '1')
                result += Math.pow(2, i - 1);
        }

        return result;
    }

    public static void main(String[] args) {

        BinaryToDecimal btd = new BinaryToDecimal();
        System.out.println(" Result = " + btd.binToInt("10110"));
        System.out.println(" Result = " + btd.binToIntAlt("10110"));
    }

}
