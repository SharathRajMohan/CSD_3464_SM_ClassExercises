/*
take the exercise 1, but here we want to take the coordinates of circle origin and its radius
* calculate the area like ex. 1
* take coordinates of another point and check if the point is in the circle, on the circle or out of the circle?
*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the radius of a circle :");
        double radius = myObj.nextDouble();
        System.out.println("Enter the x co-ordinate of the circle's origin:");
        double x = myObj.nextDouble();
        System.out.println("Enter the y co-ordinate of the circle's origin:");
        double y = myObj.nextDouble();
        double area = 3.141 * (radius * radius);

        System.out.printf("The area of the circle having radius %.2f is : %.2f", radius, area);
        System.out.println("Enter the x co-ordinate of a point :");
        double x1 = myObj.nextDouble();
        System.out.println("Enter the y co-ordinate of a point :");
        double y1 = myObj.nextDouble();

        if ((x1 < radius && x1 > -radius  ) && (y1 < radius && y1 > -radius)){
            System.out.println("Point lies inside the circle");
        } else if ((x1 == radius) || (y1 == radius)){
            System.out.println("Point lies on the circle");
        } else {
            System.out.println("Point lies out of the circle");
        }

    }
}
