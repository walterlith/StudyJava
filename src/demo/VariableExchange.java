package demo;

import java.util.Scanner;

/**
 * 原理：
 * 1.任意一个变量X与其自身进行异或运算，结果为0，即X^X=0
 * 2.任意一个变量X与0进行异或运算，结果不变，即X^0=X
 * 3.异或运算具有可结合性，即a^b^c=（a^b）^c=a^（b^c）
 * 4.异或运算具有可交换性，即a^b=b^a
 *
 * 请输入变量A的值
 * 50
 * 请输入变量B的值
 * 100
 * A=50	B=100
 * 执行变量互换
 * A=100	B=50
 */
public class VariableExchange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入变量A的值");
        long A = scan.nextLong();
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();
        System.out.println("A="+A + "\tB=" + B);
        System.out.println("执行变量互换");
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A="+A + "\tB=" + B);
    }
}
