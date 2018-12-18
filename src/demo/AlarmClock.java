package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlarmClock {
    private int delay;
    private boolean flag;
    public AlarmClock(int delay, boolean flag){
        this.delay = delay;
        this.flag = flag;
    }

    public void start(){
        class Printer implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                SimpleDateFormat format = new SimpleDateFormat("k:m:s");
                String result = format.format(new Date());
                System.out.println("当前的时间是：" + result);
                if(flag){
                    Toolkit.getDefaultToolkit().beep();
                }
            }

        }
        new Timer(delay, new Printer()).start();
    }

    public static void main(String[] args){
        AlarmClock alarmClock = new AlarmClock(1000, true);
        alarmClock.start();
    }
}
