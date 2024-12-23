public class Largest {
public static void main(String[] args) {
    int [] numbers = { 30, 5, 1, 9, 7,29};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }

    System.out.println("max number is "+max);
}
}
