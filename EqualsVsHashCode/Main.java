package EqualsVsHashCode;
 class Employee{

    private String name;
    private int age;
    private int salary;

    public Employee(String name,int age,int sal){
        this.name = name;
        this.age = age;
        this.salary = sal;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
             return true;
        }

        if(obj==null || (this.getClass() != obj.getClass())){
            return false;
        }

        Employee emp = (Employee)obj;

        return (this.name == emp.name && this.age == emp.age);
    }

   //you can override the java hashcode

}

public class Main {
    public static void main(String[] args){

        System.out.println("checking for primitives");
        int a = 2;
        int b = 2;
        System.out.println(a==b);

        Employee e1= new Employee("Atharv",22,50000);
        Employee e2= new Employee("Athar",22,50000);
        Employee e3= new Employee("Atharv",22,50000);

        if(e1.hashCode()==e3.hashCode()){
            System.out.println(e1.hashCode());
            System.out.println(e1.equals(e3));
        }
        else{
            System.out.println("objects are not equal");
        }


    }
}
