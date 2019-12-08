class Student{
    private String name;
    private int grade;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public Student(){

    }
    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
    }
}
public class MyClass3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("hello",100);
        s1.setName("job");
        s1.setGrade(99);
        System.out.println(s1.getName()+" "+s1.getGrade());
        System.out.println(s2.getName()+" "+s2.getGrade());
    }
}
