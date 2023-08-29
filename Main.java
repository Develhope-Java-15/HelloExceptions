public class Main {
    public static void main(String[] args) {
        try {
            int result = power(5, -2);
            System.out.println(result);
        } catch(PowerException e) {
            System.err.println("Unable to execute power operation!");
        }
    }

    private static int power(int base, int exponent) throws PowerException {
        if(exponent < 0) {
            throw new PowerException(base == 0);
        }

        int result = 1;
        for(int i = 0; i < exponent; ++i) {
            result *= base;
        }
        return result;
    }
}