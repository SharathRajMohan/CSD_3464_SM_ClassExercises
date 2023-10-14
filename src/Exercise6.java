import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
        public static void RunExercise5() {
            Integer num = null;
            Scanner myScan = new Scanner(System.in);
            do {
                System.out.println("Enter a number:");
                try {
                    num = myScan.nextInt();
                    break;
                }
                catch (Exception ex){
                    System.out.println("You seem to have entered an invalid option!");
                    myScan.nextLine();
                }
            } while (true);



        }
}
