package demo;

import sun.java2d.loops.GraphicsPrimitive;

public class ThreadSafeTest implements Runnable {
    int num = 10;
    @Override
    public void run(){
        while(true){
            if(num > 0){
                try{
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("车票还有 " + num-- + "张");
            }
        }
    }

    public static void main(String[] args){
        ThreadSafeTest threadSafeTest = new ThreadSafeTest();
        Thread t1 = new Thread(threadSafeTest);
        Thread t2 = new Thread(threadSafeTest);
        Thread t3 = new Thread(threadSafeTest);
        Thread t4 = new Thread(threadSafeTest);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
