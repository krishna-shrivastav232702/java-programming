import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ranging from 38 to 48");
        int number= input.nextInt();
        System.out.println(" you entered " + number);
        String size;
        switch(number){
            case 40:
                size ="small";
                break;
            
            case 41:
                size ="large";
                break;
            
            case 43:
                size = "extra large";
                break;
            
            case 44:
                size = "2 x large";
                break;

            default:
                size = "unknown";
                break;
            }
            System.out.println("size: " + size);
        }
    }

