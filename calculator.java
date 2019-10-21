import hm.Test;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/21 21:03
 * @Description:
 * 利用接口做参数，写个计算器，能完成加减乘除运算。
 * （1）定义一个接口Compute含有一个方法int computer(int n, int m)。
 * （2）设计四个类分别实现此接口，完成加减乘除运算。
 * （3）设计一个类UseCompute，类中含有方法：
 *     public void useCom(Compute com, int one, int two)，
 *     此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
 * （4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
 */
interface Icomputer{
     int computer(int n,int m);
}
class Add implements Icomputer{
    public int computer(int n,int m){
        int A=n+m;
        return A;
    }
}
class Minus implements Icomputer{
    public int computer(int n,int m){
        int M=n-m;
        return M;
    }
}
class Multiplication implements Icomputer{
    public int computer(int n,int m){
        int M1=n*m;
        return M1;
    }
}
class Divison implements Icomputer{
    public int computer(int n,int m){
        int D=n/m;
        return D;
    }
}
class UseCompute{
    public void UseCom(Icomputer com,int one,int two){
        System.out.println(com.computer(one,two));
    }
}
public class Test2 {
    public static void main(String[] args) {
    UseCompute uc=new UseCompute();
    Add a1=new Add();
    Minus m1=new Minus();
    Multiplication p1=new Multiplication();
    Divison d1=new Divison();
        System.out.println("请输入两个整数进行运算：");
        Scanner s1=new Scanner(System.in);
        int m=s1.nextInt();
        int n=s1.nextInt();
        System.out.println("加法");
        uc.UseCom(a1,m,n);
        System.out.println("减法");
        uc.UseCom(m1,m,n);
        System.out.println("乘法");
        uc.UseCom(p1,m,n);
        System.out.println("除法");
        uc.UseCom(d1,m,n);
    }

}
