// Sort //Min //Max
public class Exercise9 {
    public static int FindMin(int [] raw_list){
        int list_length = raw_list.length;
        int init_min = raw_list[0];
        for (int j : raw_list) {
            if (j < init_min) {
                init_min = j;
            }
        }
        return(init_min);
    }

    public static int FindMax(int [] raw_list){
        int list_length = raw_list.length;
        int init_max = raw_list[0];
        for (int j : raw_list) {
            if (j > init_max) {
                init_max = j;
            }
        }
        return(init_max);
    }
    // Bubble Sort
    public static void  SortArray(int [] raw_list,boolean asc){
        int [] sorted_array = new int[raw_list.length];
        int temp_hold;
        if (asc) {
            for(int j=0;j<raw_list.length;j++){
                for(int i=0;i<raw_list.length;i++){
                    if(raw_list[j]<raw_list[i]){
                        temp_hold = raw_list[j];
                        raw_list[j] = raw_list[i];
                        raw_list[i] = temp_hold;
                    }
                }
            }
        } else {
            for(int j=0;j<raw_list.length;j++){
                for(int i=0;i<raw_list.length;i++){
                    if(raw_list[j]>raw_list[i]){
                        temp_hold = raw_list[j];
                        raw_list[j] = raw_list[i];
                        raw_list[i] = temp_hold;
                    }
                }
            }
        }
    }


}
