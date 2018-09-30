package demo;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入一个整数");
        long number = scanner.nextLong();
        String check = number%2==0 ? "这是个偶数" : "这是个奇数";
        System.out.println(check);
    }
}
