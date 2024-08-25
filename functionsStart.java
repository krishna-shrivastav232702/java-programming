public class functionsStart {
    public static void main(String[] args) {
        
        System.out.println("Let's Get Started");
        //calling a function
        sayHello();
        System.out.println("See you soon!");
        int  result = addNumber(25,10) ;
        System.out.println(result);
        double ans = Math.sqrt(4);
    }
    //declaring a function
    public static void sayHello() {

            System.out.println("Hello To you !");
            System.out.println("Hello To you !");

    }
    public static int addNumber(int val1,int val2){
        int sum=val1+val2;
        return sum;
    }  
}
