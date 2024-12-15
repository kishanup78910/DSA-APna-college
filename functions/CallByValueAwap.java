package functions;

public class CallByValueAwap {
    public static void main(String[] args) {
        int a = 10;
        int b=20;

        System.out.println("brfore swap x "+ a +" y "+b);

        int temp = a;
         a=b;
         b=temp;
         System.out.println("after swap x "+ a +" y "+b);
       

    }
}
