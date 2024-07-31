package eyad.dev;

public class ArmstrongNumber {
    public boolean isArmstrong(int number) {
        int armnumb = number; 
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; 
            int powerDigit = (int) Math.pow(digit, numberOfDigits); 
            sum += powerDigit;

            number /= 10; 
        }
        if (armnumb == sum) {
            return true;
        } else {
            return false;
        }
    }
}