package hm2;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/17 20:46
 * @Description:
 * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class A {
    public static void main(String[] args) {
         int i;
         int n;
        for(i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(i==a*a*a+b*b*b+c*c*c)
                System.out.println(i);
        }
    }
}
package hm2;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/17 20:03
 * @Description:
 * 定义一个Father和Child类，并进行测试。
 * 要求如下：
 * 1）Father类为外部类，类中定义一个私有的String类型的属性name，name的值为“zhangjun”。
 * 2）Child类为Father类的内部类，其中定义一个introFather()方法，方法中调用Father类的name属性。
 * 3）定义一个测试类Test，在Test类的main()方法中，创建Child对象，并调用introFather ()方法。
 */
public class Myclass {
    public static void main(String[] args) {
        Father.Child c1=new Father().new Child();
        c1.intorFather();
    }

}
class Father{
    private String name="zhangjun";
    class Child{
        public void intorFather(){
            Father f1=new Father();
            System.out.println(f1.name);
        }
    }
}

class A{ 
int y=6; 
class Inner{ 
static int y=3; 
void show(){ 
System.out.println(y); 
} 
} 
} 
class Demo{ 
public static void main(String [] args){ 
A.Inner inner=new A().new Inner(); 
inner.show(); 
} 
} 

class A{ 
public A(){ 
System.out.println(“A”); 
} 
} 

class B extends A{ 
public B(){ 
System.out.println(“B”); 
} 

public static void main(String[] args){ 
B b=new B(); 
} 
} 
