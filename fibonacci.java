import java.util.Scanner;

public class fibonacci {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number to get output of the series of the fibonacci number");
        int n = scn.nextInt();
        int x = 0, y = 1, i;
        int z = 0;
        for (i = 0; i < n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println("fib of n is: " + z);
    }
}
// for space and time complexity 0(1) and 0(n)
// code is 
// public class FibonacciSeries {
//     public static void main(String[] args) {
//         int n = 10; // Change the value of n as needed
//         printFibonacciSeries(n);
//     }

//     public static void printFibonacciSeries(int n) {
//         if (n <= 0)
//             return;

//         int a = 0, b = 1;
//         System.out.print(a + " " + b + " ");

//         for (int i = 2; i < n; i++) {
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }
//     }
// }
