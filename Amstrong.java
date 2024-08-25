import java.util.Scanner;

public class Amstrong {
    // A positive integer is called an Armstrong number if abc=a^n+b^n+c^n
    // 153=1^3+5^3+3^3

    public static int count(int number) {
        int count = 0;

        while (number != 0) {
            int rem = number % 10; // Corrected this line
            count++;
            number = number / 10; // Corrected this line
        }
        System.out.printf("You entered a number which contains %d digits\n", count);
        return count;
    }

    public static int power(int x, int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum * x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int n = count(number); // n=power
        int add = 0;
        int tempNumber = number; // Store the original number to use it later

        while (tempNumber != 0) { // Corrected to use tempNumber instead of number
            int rem = tempNumber % 10;
            int x = power(rem, n);
            add = add + x;
            tempNumber = tempNumber / 10; // Corrected to use tempNumber instead of number
        }
        System.out.println(add);
        if(add==number){
            System.out.println("Amstrong Number");
        }
        else {
            System.out.println("Not an Amstrong Number");
        }
    }
}


//for less time and space complexity
//public class ArmstrongNumbers {
//    public static boolean isArmstrong(int num) {
//        int originalNum = num;
//        int numDigits = String.valueOf(num).length();
//        int sum = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, numDigits);
//            num /= 10;
//        }
//
//        return sum == originalNum;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Armstrong numbers between 1 and 1000:");
//        for (int i = 1; i <= 1000; i++) {
//            if (isArmstrong(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//}