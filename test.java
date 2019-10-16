package hm;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/16 10:03
 * @Description:编写一个程序，展示无论你创建了某个特定类的多少个对象，
 *              这个类的某个特定的static成员变量只有一个属性。
 *  static 可以修饰属性和方法，与对象无关
 *  1.修饰属性，称为静态属性（类属性），所有对象共享此属性值。通过类名称直接调用。
 *  2.修饰方法，称为类方法，直接通过类名称调用，与对象实例化无关。
 */

class Test2{
    public int height;
    public static String hair;
    public int tall;
}

public class Boy {
    public static void main(String[] args) {
        Test2 a1=new Test2();
        a1.hair="黑长直";
        Test2 a2=new Test2();
        a1.hair="棕短卷";

        System.out.println(a1.hair);
        System.out.println(a2.hair);
    }
}
   // 棕短卷
  //  棕短卷
