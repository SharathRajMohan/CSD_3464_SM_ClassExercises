import java.util.Scanner;

// write a program to convert Fahrenheit to Celsius
public class Exercise2 {
    public static void main(String[] args){
        System.out.println("Enter the temperature in fahrenheit: ");
        Scanner myObj = new Scanner(System.in);
        double fahrenheit = myObj.nextDouble();
        double celsius = (fahrenheit -32) * 5/9;
        System.out.printf("The fahrenheit temperature %.2f in Celsius is: %.2f",fahrenheit,celsius);
    }
}
