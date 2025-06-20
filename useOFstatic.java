class Student{
    String name;
    static String school;
}

public class OOPS{
    public static void main(String args[]){
        Student.school="LFS";
        Student s1 = new Student();
        s1.name="Shivam";
        System.out.println(s1.name+" from "+Student.school);
        Student s2 = new Student();
        s2.name="xyz";
        System.out.println(s2.name+" from "+Student.school);
    }
}
