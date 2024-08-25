public class pattern4 {
    public static void main(String[] args) {
        int n =11;
        int trows=n;
        int stars=1;
        int spaces=(n-1)/2;
        for(int row=1;row<=trows;row++){
            //work
            for(int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //prep
            System.out.println();
            if(row<=trows/2){
                stars+=2;
                spaces--;
            }
            else{
                stars-=2;
                spaces++;
            }
        }
    }
}
