package demo;

/**
 * 算法没有搞明白
 */
public class NineTable {
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        int a = 2;
        int b = 3/2;
        for(int i = 1; i <= 9; i++){
            arr[a++][b++] = i;
            if(i%3==0){
                a = a -2;
                b = b -1;
            }else{
                a = a%3;
                b = b%3;
            }
        }
        System.out.println("输出九宫格");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
