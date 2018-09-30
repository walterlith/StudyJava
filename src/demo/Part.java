package demo;

public class Part {
    static final float PI = 3.14F;
    static int age = 23;

    public static void main(String[] args){
        final int number;
        number = 1234;
        age = 22;
        System.out.println("常量 PI 的值为" + PI);
        System.out.println("赋值后 number 的值为" + number);
        System.out.println("int 型变量 age 的值为" + age);

    }
}
