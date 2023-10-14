import java.util.Scanner;

class MyException extends Exception {
}

public class Scalaire {

    // Scanner Object
    Scanner myScan = new Scanner(System.in);



    // Methods
    // Get VectorSize
    public int getsetVectorSize() {
        int vectorSize;
        while(true) {
            try {
                System.out.println("Enter the size of the vectors: ");
                vectorSize = myScan.nextInt();
                if (vectorSize>10){
                    throw new MyException();
                }
                break;
            } catch (Exception ex) {
                System.out.println("You seem to have entered an invalid option!");
                myScan.nextLine();
            }
        }
        return vectorSize;
    }

    public double[] getsetVectors(int VectorSize) {
        double [] v_raw = new double[VectorSize];
        for(int i=0;i<VectorSize;i++) {
            while (true) {
                try {
                    System.out.println("Enter element "+i+" of the vector: ");
                    v_raw[i] = myScan.nextDouble();
                    break;
                } catch (Exception ex) {
                    System.out.println("You seem to have entered an invalid option!");
                    myScan.nextLine();
                }
            }
        }
        return v_raw;
    }

    public double VectorProduct(double[] v1,double[] v2) {
        int VectorSize = v1.length;
        double product_vector = 0;
        for(int i=0;i<VectorSize;i++) {
            product_vector = product_vector + (v1[i]*v2[i]);
        }
        return product_vector;
    }

}
