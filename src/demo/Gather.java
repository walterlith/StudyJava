package demo;

import java.util.ArrayList;
import java.util.List;

public class Gather {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random() * (list.size() - 1));
        System.out.println("随机获取数组中的元素：" + list.get(i));
        list.remove(i);
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j) + " ");
        }


    }
}
