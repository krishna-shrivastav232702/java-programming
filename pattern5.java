public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int frow=1;frow<=2*n-1;frow++){
            System.out.print("*");
        }
        System.out.println();
        int trow=n-1;
        int stars=n-1;
        int spaces=1;
        for(int row=1;row<=trow;row++){
            //work
            //stars
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //spaces
            for(int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //prep
            System.out.println();
            spaces+=2;
            stars--; 
        }
    }
}