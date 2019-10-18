package hm3;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/18 19:37
 * @Description:
 */
interface InterfaceA {
    String S = "good ";
    void f();
}

abstract class ClassA {
    abstract void g();
}

class ClassB extends ClassA implements InterfaceA {
    void g() {
        System.out.print(S);
    }

    public void f() {
        System.out.print(" "+ S);
    }
}
public class Test1 {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        InterfaceA b = new ClassB();
        a.g();
        b.f();
    }
}
//good  good
