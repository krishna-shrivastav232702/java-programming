import java.util.Scanner;
public class triangle_types {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter three sides of triangle in cm");
        int x = scn.nextInt(),y= scn.nextInt(),z=scn.nextInt();
        System.out.println("you entered " +x+ "," +y+ "," +z);
        if((x==y)&&(y==z)&&(x==z)){
            System.out.println("Equilateral Triangle");
        }
        else if((x==y)||(y==z)||(x==z)){
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }
}
