import java.util.Scanner;
public class week {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number from 1 to 7 to access days");
        int x = scn.nextInt();
        switch(x){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("invalid input");
            break;
        }
    }
}
