public class pattern6 {
    public static void main(String[] args) {
        int n = 11;
        int x = (n + 1) / 2;
        int stars = 1;
        int spaces = n - 2;
        for (int row = 1; row < x; row++) {
            // work
            // stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            // stars
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            // prep
            System.out.println();
            stars++;
            spaces -= 2;
        }
        for (int frow = 1; frow <= n; frow++) {
            System.out.print("*");
        }
        System.out.println();
        int Spaces=1;
        int Stars=n/2;
        for(int row=5;row<=n;row++){
            //work
            //stars
            for(int cst1=1;cst1<=Stars;cst1++){
                System.out.print("*");
            }
            //spaces
            for(int csp1=1;csp1<=Spaces;csp1++){
                System.out.print(" ");
            }
            //stars
            for(int cst1=1;cst1<=Stars;cst1++){
                System.out.print("*");
            }

            //prep
            System.out.println();
            Stars--;
            Spaces+=2;
        }

    }
}
