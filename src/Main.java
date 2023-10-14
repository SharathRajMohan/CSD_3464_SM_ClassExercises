import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int [] SampleArray = {34,67,89,100,2,4};
        System.out.println("Hello and welcome!");
        // Exercise5.RunExercise5();
        // Exercise5.RunExercise5();
        // Exercise7.RunExercise7();
        // Exercise8.RunExercise8();
//        System.out.println(Exercise9.FindMin(SampleArray));
//        System.out.println(Exercise9.FindMax(SampleArray));
//        Exercise9.SortArray(SampleArray, true);
//        System.out.println(Arrays.toString(SampleArray));
//        Exercise9.SortArray(SampleArray, false);
//        System.out.println(Arrays.toString(SampleArray));
        Scalaire sx = new Scalaire();
        int size = sx.getsetVectorSize();
        double[] v1 = sx.getsetVectors(size);
        double[] v2 = sx.getsetVectors(size);
        double vectorProduct = sx.VectorProduct(v1,v2);
        System.out.println("The vector product of "+ Arrays.toString(v1) +" and "+ Arrays.toString(v1) +" Is: "+vectorProduct );

    }
}
