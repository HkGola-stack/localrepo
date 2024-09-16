public class reverse {
    public static void main(String[] args) {
        // Reverse a number
        int number = 1234;
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        System.out.println("Reverse of the number are " + rev);

    }
}
