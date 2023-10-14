// Write a Java program that reads a number and indicates whether it is positive, negative, zero,
//odd, or even.

import java.util.Scanner;

public class Exercise5 {
    public static void RunExercise5() {
        Integer num = null;
        boolean flag = true;
        Scanner myScan = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            try {
                num = myScan.nextInt();
                flag = false;
            }
            catch (Exception ex){
                System.out.println("You seem to have entered an invalid option!");
                myScan.nextLine();
            }
        } while (flag);

        if (num>0){
            System.out.println("Entered number is greater than 0.");
            if(num/2==0){
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
        else if(num == 0){
            System.out.println("The number is zero.");
        }
        else {
            System.out.println("The number is negative.");
        }
    }
}
