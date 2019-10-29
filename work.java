package sjhm;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/28 19:22
 * @Description:
 * 16.要求用户输入一串数，使用do-while将它反转过去！
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println("请输入一串数：");
        Scanner s1=new Scanner(System.in);
        int m=s1.nextInt();
        int result=0;
        do{
           int n=m%10;
           result=result*10+n;
           m=m/10;
           if(m==0){
               break;
           }
        }while (true);
        System.out.println(result);
    }
}

* 17.打印出九九乘法表
 */
public class Test9 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            System.out.println(" ");
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
        //System.out.println(n);
    }
}

* @Description:
 * 15.用while循环方式做一个图形！直角三角形！
 */
public class TestWork {
    public static void main(String[] args) {
       int n=1;
       while (n<6){
           int m=0;
           while (m<n){
               System.out.print("*");
               m++;
           }
           n++;
           System.out.println();
       }
    }
}
