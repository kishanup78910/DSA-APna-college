package functions;

public class BinaryToDecimal {

    public static int binaryToDecimal(String binary) {
        int res=0;
        int power=0;
        for(int i=binary.length()-1;i>=0;i--){
           char bit  = binary.charAt(i);
           if(bit=='1'){
            res += Math.pow(2, power);
           }
           power++;
        }
        return res;

    }
    public static void main(String[] args) {
        String binaryNumber = "1010";
        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("Binary Number: " + decimalNumber);
    }
}
