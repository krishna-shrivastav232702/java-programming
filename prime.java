import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number to check for prime");
        int x = scn.nextInt();
        int flag = 2;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag++;
             }
        }

        if (flag == 2) {
            System.out.println("prime number");
        } 
        else {
            System.out.println("composite number");
        }
    }
}
