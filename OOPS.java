class Pen {
    String color;
    String type;
    
    public void write() {
        System.out.println("write something");
    }
    
    public void printColor(){
        System.out.print("Color of pen is:");
        System.out.println(this.color);
    }
    
     public void printType(){
        System.out.print("Type of pen is:");
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.print("Name of student is:");
        System.out.println(this.name);
        System.out.print("Age of student is:");
        System.out.println(this.age);
    }
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class OOPS{
    
    public static void main(String args[]){
        // Pen pen1 = new Pen();
        // pen1.color="blue";
        // pen1.type="ballpoint";
        
        // Pen pen2 = new Pen();
        // pen2.color="black";
        // pen2.type="gel";
        
        // pen1.write();
        // pen1.printType();
        // pen1.printColor();
        
        // pen2.write();
        // pen2.printType();
        // pen2.printColor();
        
        Student s1 = new Student("Shivam",23);
        // s1.name="Shivam";
        // s1.age=23;
        
        Student s2 = new Student("Divyanshu",23);
        // s2.name="Divyanshu";
        // s2.age=23;
        
        s1.printInfo();
        s2.printInfo();
    }
}
