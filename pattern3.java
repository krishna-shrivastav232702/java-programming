import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter no of trows which will be odd");
        int trows = scn.nextInt();
        int stars=1;
        for(int row=1;row<=trows;row++){
            //work
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //prep
            System.out.println();
            if(row<=(trows)/2){
                stars++;
            }
            else {
                stars--;
            }
           
        }
    }
}
