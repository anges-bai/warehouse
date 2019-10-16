package hm;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/16 10:52
 * @Description:
 * 一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字
 * (从第三个数字起)都是前两个数字的和。创建一个方法，接受一个整数参数，
 * 并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
 * 例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n=s1.nextInt();

        int sum=0;
        for(int i=1;i<n+1;i++){
            System.out.println(Fibonacci(i));
            sum=sum+Fibonacci(i);
        }
        System.out.println("前几项和为："+sum);

    }
    public static int Fibonacci(int n){
        if(n==1 || n==2)
            return n=1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);

    }
}
