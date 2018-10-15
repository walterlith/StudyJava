package demo;

public class Emperor {
    private static Emperor emperor = null;
    private Emperor(){

    }
    public static Emperor getInstnce(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }
    public void getName(){
        System.out.println("My name is Emperor");
    }
}
