package demo;

public class MinNum {
    public static void main(String[] args){
        int[] num = {8, 3, 4, 1, 6, 10};
        System.out.println("输出一维数组：");
        for(int i = 0; i< num.length; i++){
            System.out.print(num[i] + "  ");
        }
        int min = num[0];
        for(int j = 0; j < num.length - 1; j++){
            if(min > num[j+1]){
                min = num[j+1];
            }
        }
        System.out.print("\n一维数组的最小值是：" + min);
    }
}
