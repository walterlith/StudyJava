package demo;

public class CheckNumber {
    public static void main(String[] args){
        String s = new String("12345667s");
        if(CheckNumber.isNumber(s)){
            System.out.println(s + " 是数字格式");
        }else{
            System.out.println(s + " 不是数字格式");
        }

    }

    private static boolean isNumber(String s){
        char[] c = s.toCharArray();
        boolean flag = true;
        for(int i = 0; i<c.length; i++){
            if(Character.isDigit(c[i])){
                continue;
            }else{
                flag = false;
            }
        }
        return flag;
    }
}
