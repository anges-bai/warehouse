class Student1{
    public String name;
    public int age;
    public Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
   public String getName(){
        return name;
   }
   public int getAge(){
        return age;
   }

    public void show(){
        System.out.println(getName());
        System.out.println(getAge());
    }
}
class Undergraduate extends Student1{
    public String degree;
    public Undergraduate(String name,int age,String degree){
        super(name,age);
        this.degree=degree;
    }

    public String getDegree(){
        return degree;
    }
    public void show(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getDegree());
    }
}
public class MyClass4 {
    public static void main(String[] args) {
        Student1 ss1=new Student1("kate",17);
        ss1.show();
        Undergraduate u1=new Undergraduate("alice",17,"collage");
        u1.show();
    }
}
