package demo;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for(int k = 1; k < i; k++){
                for(int t = 1; t <= 10; t++){
                    System.out.print(" ");
                }
            }
            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + " = " + i * j);
                if(i*j < 10){
                    System.out.print("   ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("\r");

        }
    }
}
