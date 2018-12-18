package demo;

import java.io.*;
public class FileTest {
    public static void main(String[] args){
        File file = new File("/Users/shiwentao", "work.txt");
        try{
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "明日科技 Java 部".getBytes();
            out.write(buy);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("文件中的信息是：" + new String(byt, 0, len));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
