package functions;

public class DecimalToBinary {

    public static String decimalToBinary(int decimal) {
        String binary="";

        if(decimal==0){
            return "0";
        }
        while(decimal>0){
            int remainder=decimal%2;
            binary=remainder+binary;
            decimal=decimal/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int n=10;

        
    }
}
