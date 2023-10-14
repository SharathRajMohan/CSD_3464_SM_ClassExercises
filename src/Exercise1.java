import java.util.Scanner;

// please write a program to take an input for the radius of a circle and calculate the area
public class Exercise1 {
    public static void RunExercise1(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the radius of a circle :");
        double radius = myObj.nextDouble();
        double area  = 3.141 * (radius * radius);

        System.out.printf("The area of the circle having radius %.2f is : %.2f",radius,area);
    }
}
