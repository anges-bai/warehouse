interface Shape{
    double area(double n);
}
class Square implements Shape{
    @Override
    public double area(double n) {
        return n*n;
    }
}
class Circle implements Shape{
    @Override
    public double area(double n) {
        return 3.14*n*n;
    }
}
public class MyClass5 {
    public static void main(String[] args) {
        Square s1=new Square();
        Circle c1=new Circle();
        System.out.println(s1.area(2.0));
        System.out.println(c1.area(3.0));
    }
}
