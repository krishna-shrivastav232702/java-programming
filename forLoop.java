import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two numbers for initialisation and ending");
        int x = scn.nextInt(), y = scn.nextInt();
        System.out.println("you entered " + x + "," + y);
        if (x < y) {

            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
        else{
            for(int i=x;i>=y;i--){
                System.out.println(i);
            }
        }
    }
}
