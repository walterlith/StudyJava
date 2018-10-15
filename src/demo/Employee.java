package demo;

import javafx.scene.Camera;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int id;
    private int age;
    private String name;

    public Employee(int id, String name, int age){
        this.id = id;
        this.age = age;
        this.name = name;

    }


    @Override
    public int compareTo(Employee o) {
        if(this.id > o.id){
            return 1;
        }else if(this.id < o.id){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args){
        List<Employee> employeesList = new ArrayList();
        employeesList.add(new Employee(2,"2", 2));
        employeesList.add(new Employee(1,"1", 1));
        employeesList.add(new Employee(3,"3", 3));
        employeesList.add(new Employee(5,"5", 5));
        employeesList.add(new Employee(4,"4", 4));
        for (Employee item : employeesList
                ) {
            System.out.print(item.id);
        }
        employeesList.sort(Employee::compareTo);
        System.out.println();
        for (Employee item : employeesList
             ) {
            System.out.print(item.id);
        }



    }
}
