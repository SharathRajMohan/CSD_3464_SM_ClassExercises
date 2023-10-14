public class Exercise7 {
    public static void RunExercise7(){
        System.out.println("Tables of multiplication");
        for(int i=2;i<11;i++){
            System.out.println("Table of "+i);
            for(int j=1;j<11;j++){
                System.out.println(j+"*"+i+"="+i*j);
            }
        }
    }
}
