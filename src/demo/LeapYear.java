package demo;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份（整数）：");
        long year = scanner.nextLong();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0 ){
            System.out.println(year + "年是闰年");
        }else{
            System.out.println(year + "年不是闰年");
        }


    }
}
