package demo;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = new int[]{20, 40, 90, 30, 80, 70, 50};
        System.out.print("排序前：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        System.out.print("\n排序后：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
