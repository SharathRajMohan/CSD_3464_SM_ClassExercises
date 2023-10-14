import java.util.Scanner;
//PGDC
public class Exercise8 {
    public static int [] getInput(){
        int[] nums = new int[2];
        Scanner myScan = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter number 1:");
                nums[0] = myScan.nextInt();
                myScan.nextLine();
                System.out.println("Enter number 2:");
                nums[1] = myScan.nextInt();
                break;
            }
            catch (Exception ex){
                System.out.println("You seem to have entered an invalid option!");
                myScan.nextLine();
            }
        } while (true);
        return (nums);
    }

    public static int getGCD(int a, int b){
        int divisor = 0;
        while(a!=b) {
            if(a>b){
                a = a-b;
            } else{
                a = a+b;
                b = a-b;
                a = a-b;
            }
        }
        divisor = a;
        return(divisor);
    }
    public static void RunExercise8() {
        int [] numbers = getInput();
        int divisor = getGCD(numbers[0],numbers[1]);
        System.out.println("The GCD is: "+divisor);
    }
}
