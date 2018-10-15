package demo;

public class InsertSort {
    public static void main(String[] args){
        int[] array = new int[]{20, 40, 90, 30, 80, 70, 50};
        System.out.print("排序前：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = 1; i < array.length; i++){
            int tmp = array[i];
            int j;
            for( j = i-1; array[j] > tmp && j >= 0; j--){
                array[j+1] = array[j];
            }
            array[j+1] = tmp;
        }

        System.out.print("\n排序后：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
