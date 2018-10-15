package demo;

import java.util.StringTokenizer;

public class StringTo {
    public static void main(String[] args){
        String text = " We are students ";
        System.out.println("原字符串是：");
        System.out.println(text);
        StringTokenizer st = new StringTokenizer(text, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreTokens()){
            sb.append(st.nextToken());
        }
        System.out.println("去掉字符串中所有空格后的字符串：");
        System.out.println(sb.toString());
    }
}
