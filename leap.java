import java.util.Scanner;
public class leap {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a year");
    int year = input.nextInt();
    System.out.println("you entered " +year);
    if(((year%4==0)&&(year%100!=0))||(year%400==0)){
        System.out.println("leap year");
    }
    else{
        System.out.println("not a leap year");
    }
    }
}
