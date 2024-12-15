package functions;

public class Factorial {
    public static int factorial(int n) {
        int res=1;
        int j=1;
        while(j<=n){
            res=res*j;
            j++;
        }

        
        return res;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
}
