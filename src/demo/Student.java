package demo;

public class Student {
    private int id;
    private String name;
    private boolean male;
    private double accounts;

    private int getId(){
        return this.id;
    }

    private void setId(int id){
        this.id = id;
    }

    private String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }

    private boolean getMale(){
        return this.male;
    }

    private void setMale(boolean male){
        this.male = male;
    }

    private double getAccounts(){
        return this.accounts;
    }

    private void setAccounts(double accounts){
        this.accounts = accounts;
    }

    public static void main(String[] args){
        Student student = new Student();
        Class<?> clazz = student.getClass();
    }
}
