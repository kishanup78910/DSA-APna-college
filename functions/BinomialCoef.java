package functions;

public class BinomialCoef {

    public static int fact(int n) {
        int j=1;

        for(int i=1;i<=n;i++){
            j=j*i;
        }
        return j;
    }
    public static void main(String[] args) {
        
        int n = 5;
        int r = 3;
        int result = fact(n)/(fact(r)*fact(n-r));
        System.out.println("The binomial coefficient is: "+result);
    }
}
