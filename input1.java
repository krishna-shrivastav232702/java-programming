import java.util.Scanner;
public class input1 {
    public static void main(String[] args){  
        int a=10;           
        System.out.println("i am " +"awesome");
        System.out.println("value = " + a);
        //creating an object of scanner class

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number ");
        //take input from user
        int number = input.nextInt();
        System.out.println("you entered "+ number);
        float myfloat = input.nextFloat();
        System.out.println("you entered "+ myfloat);
        String mystring = input.next();
        System.out.println("you entered " + mystring);
    }
}
