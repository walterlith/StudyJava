package demo;

public class ThreadCopySafeTest implements Runnable {
    int n = 10;
    @Override
    public void run(){
        while(true){
            synchronized (this){
                if(0 < n){
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("车票还有 " + n-- + "张");
                }
            }

        }
    }

    public static void main(String[] args){
        ThreadCopySafeTest t= new ThreadCopySafeTest();
        Thread t2 = new Thread(t);
        Thread t1 = new Thread(t);
        Thread t4 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
