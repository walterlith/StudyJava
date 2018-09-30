package demo;

public class SumNum {
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int item : num) {
            sum += item;
        }
        System.out.println(sum);
    }
}
