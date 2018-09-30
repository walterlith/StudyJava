package demo;

public class Val {
    static int times = 3;
    public static void main(String[] args){
        int times = 4;
        System.out.println("变量 times " + times);
        System.out.println("静态变量 times " + Val.times);

        //times = 4;
        //System.out.println("变量 times " + times);
        //System.out.println("变量 times " + Val.times);
    }

}
