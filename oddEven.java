    import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println("you entered :"+number);
        if(number%2==0){
            System.out.println("your entered number was even");
        }
        else{
            System.out.println("your entered number was odd");
        }
    }
}


