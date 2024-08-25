import java.util.Scanner;
public class triangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter three angles ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        // int x = input.nextInt(), y = input.nextInt(), 
        // z = input.nextInt();
        // you can initialise in the above way too!

        System.out.println("you entered " +x+"," +y+","+z);
        if(((x+y+z)==180)&&((x>0)&&(y>0)&&(z>0))){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("invalid triangle");
        }
    }
}
