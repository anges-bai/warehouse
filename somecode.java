import java.util.Scanner;

/**
 * @Description:
 * 根据天数（46）计算周数和剩余的天数
 */

public class compute {
    public int method1(int n){
        int m=n/7;
        return m;
    }
    public int method2(int n){
        int z=n%7;
        return z;
    }

    public static void main(String[] args) {
        System.out.println("请输入要计算的天数：");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        compute c1=new compute();
        System.out.println("周数为："+c1.method1(n));
        System.out.println("剩余的天数为："+c1.method2(n));
    }
}

import java.util.Scanner;

/**
 * @Description:
 * 3.判断用户输入的数是否是偶数并且画出他们的流程图
 */
class EvenNumber{
    public boolean number(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("请任意输入一个整数，若是偶数则返回true，否则false：");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        EvenNumber en=new EvenNumber();
        System.out.println(en.number(n));
    }
}
* @Description:
 * 2.已知圆的半径radius= 1.5，求其面积
 */
public class Circle {
    private static final double radius=1.5;
    private double Area(double n){
        double area=3.14*n*n;
        return area;
    }
    public static void main(String[] args) {
     Circle c1=new Circle();
        System.out.println("圆的面积为："+c1.Area(radius));
    }
}

* @Description:
 * 7.用if…else if语句判断闰年问题
 */
public class year {
    public static void main(String[] args) {
        System.out.println("请输入一个年份：");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        if(n%400==0||n%100==0)
            System.out.println(n+"是闰年");
        else
            System.out.println(n+"不是闰年");
    }
}
