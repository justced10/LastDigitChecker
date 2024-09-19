public class LastDigitChecker {



    public static void main(String[] args) {

        // Test cases

        System.out.println(hasSameLastDigit(41, 22, 71));  // should return true

        System.out.println(hasSameLastDigit(23, 32, 42));  // should return true

        System.out.println(hasSameLastDigit(9, 99, 999));  // should return false



        System.out.println(isValid(10));   // should return true

        System.out.println(isValid(468));  // should return true

        System.out.println(isValid(1051)); // should return false

    }



    // Method to check if at least two numbers have the same last digit

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        // Check if all numbers are within the valid range

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {

            return false;

        }



        // Get the last digits of the numbers

        int lastDigit1 = num1 % 10;

        int lastDigit2 = num2 % 10;

        int lastDigit3 = num3 % 10;



        // Check if at least two numbers share the same last digit

        return (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);

    }



    // Method to check if a number is within the range 10 to 1000

    public static boolean isValid(int number) {

        return number >= 10 && number <= 1000;

    }

}