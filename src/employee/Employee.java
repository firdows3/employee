package employee;

//method,constructor,object,par
//nested class,objects of nested class
public class Employee {
    String name,id;
    double sal;
//default constructor 1

    Employee(){
        System.out.println("default constructor call");
        this.name = "null";
        this.id = "null";
        this.sal  = 0.0;
    }

    Employee (String n ,String id)  {
        System.out.println("cone that take one string");
        this.name=n;
        this.id=id;
        this.sal=0.0;
    }


    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("abc","ru0138/13");
        System.out.println("e1 name : "+e1.name);
        System.out.println("el id : "+e1.id);
        System.out.println("e1 salary : "+e1.sal);
        System.out.println("e2 name : "+e2.name);
        System.out.println("e2 id : "+e2.id);
        System.out.println("e2 salary : "+e2.sal);

    }
}