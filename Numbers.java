import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers between 0 and 99");
        int num1 = new Scanner(System.in).nextInt() % 100;
        int num2 = new Scanner(System.in).nextInt() % 100;
    
        int num1dig1 = num1 / 10;
        int num1dig2 = num1 % 10;
        int num2dig1 = num2 / 10;
        int num2dig2 = num2 % 10;

        boolean sharedDigit = num1dig1 == num2dig1 || num1dig1 == num2dig2 || num1dig2 == num2dig1 || num1dig2 == num2dig2;
        
        System.out.println(sharedDigit);
    }
}
