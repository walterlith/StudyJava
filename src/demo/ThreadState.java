package demo;

import sun.awt.windows.ThemeReader;

import java.sql.SQLOutput;

public class ThreadState implements Runnable{
    public  synchronized void waitForASecond() throws InterruptedException{
        wait(500);
    }

    public synchronized void waitForYears() throws InterruptedException{
        wait();
    }

    public synchronized void notifyNow() throws InterruptedException{
        notify();
    }

    @Override
    public void run(){
        try{
            waitForASecond();
            waitForYears();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] arg) throws InterruptedException{
        ThreadState state = new ThreadState();
        Thread thread = new Thread(state);
        System.out.println("新建线程：" + thread.getState());
        thread.start();
        System.out.println("启动线程：" + thread.getState());
        Thread.sleep(100);
        System.out.println("计时等待；" + thread.getState());
        Thread.sleep(1000);
        System.out.println("等待线程：" + thread.getState());
        state.notifyNow();
        System.out.println("唤醒线程：" + thread.getState());
        Thread.sleep(1000);
        System.out.println("终止线程：" + thread.getState());
    }
}

