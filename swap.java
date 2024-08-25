public class swap {

    public static void swap(int one,int two){
        int temp;
        temp=one;
        one=two;
        two=temp;
        System.out.println(one+","+two);
    }



    public static void main(String[] args) {
        int one=10;
        int two=20;
        System.out.println(one+","+two);
        swap(one,two);
        System.out.println(one+","+two);
    }
}
