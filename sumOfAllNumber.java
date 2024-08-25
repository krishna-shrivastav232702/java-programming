import java.util.Scanner;
public class sumOfAllNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter two number to get sum of all the numbers between two number ");
        int x= scn.nextInt(),n = scn.nextInt();
        int flag=0,i;
        if(x<n){
            for(i=x;i<=n;i++){
                flag=flag+i;
                
            }
        }
        else{
            for(i=x;i>=n;i--){
                flag=flag+i;
            }
        }
        System.out.println(flag);
    }
}
