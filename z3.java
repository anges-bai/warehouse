public class MyClass2 {
    public int fib(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        MyClass2 m2=new MyClass2();
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int ret=m2.fib(n);
        System.out.println(ret);
        for (int i=1;i<=n;i++){
            System.out.print(m2.fib(i)+" ");
        }
    }
}
