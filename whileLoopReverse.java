import java.util.Scanner;
public class whileLoopReverse {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number");
        int n=scn.nextInt();
        int x=0,y;
        while(n>0){
            y=n%10;
            x=x*10+y;
            n=n/10;
        }
        System.out.println(x);
    }
}
