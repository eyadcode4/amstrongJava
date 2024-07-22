package eyad.dev;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] arguments) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        System.out.println("Is armstrong number: " + isArmstrong(number));
        
    }
    
    static boolean isArmstrong(int n) {
        int digits = 0, temp;
        int sum = 0;
        temp = n;
        while(temp >0){
            temp = temp / 10;
            digits++;

        }
        System.out.println("number of digits: " +digits);
        temp =n;
        while(temp > 0){
            int lastDigit = temp % 10;
            sum = (int) (sum + Math.pow(lastDigit, digits));
            temp = temp / 10;

        }
        System.out.println("sum is : " + sum);
        if(sum ==n)
            return true;
        return false;

    }
}
