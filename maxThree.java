import java.util.Scanner;
public class maxThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers");
        int x = input.nextInt(),y = input.nextInt(),z = input.nextInt();
        System.out.println("you entered " +x+","+y+","+z);
        if( (x>y)&& (x>z)){
            System.out.println("x is the maximum i.e x : "+x);
        }
        else if((y>x)&&(y>z)){
            System.out.println("y is the maximum i.e y : " +y);
        }
        else{
            System.out.println("z is the maximum i.e z : "+z);
        }
    }
}
