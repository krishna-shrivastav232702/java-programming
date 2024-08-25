import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of rows required for pattern");
        int n = scn.nextInt();
        int trows=n;
        for(int row = 1;row<=trows;row++){
            //work for current row
            for(int cst=1; cst<=row;cst++){
                System.out.print("*");
            }
            //prepare for next row
            System.out.println();
        }
    }
}
