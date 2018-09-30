package demo;

import java.sql.SQLOutput;

/**
 * test
 */
public class BasicTest {
    public static void  main(String[] args){
        //Hello word
        String str = "Hello World!";
        System.out.println(str);

        //print char
        char var = 97;
        System.out.println(var);

        //print int
        int t1 = 'a';
        System.out.println(t1);

        //print escape char
        char t2 = '\\';
        char t3 = '\u2605';
        System.out.println(t2);
        System.out.println(t3);

        //constant
        final double PI = 3.14;
        System.out.println(PI);
    }
}
