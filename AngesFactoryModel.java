package bit;

/**
 * @Description:代理工厂模式
 */
interface ISubjuct{
    void buycomputer();
}
class RealSubject implements ISubjuct{
    @Override
    public void buycomputer() {
        System.out.println("买一台外星人电脑");
    }
}
class ProxySubject implements ISubjuct{
   private ISubjuct subjuct;
   public ProxySubject(ISubjuct subjuct){
       this.subjuct=subjuct;
   }
   public void producecomputer(){
       System.out.println("生产外星人电脑");
   }
   public void aftercomputer(){
       System.out.println("外星人电脑售后团队");
   }
   public void buycomputer(){
       this.producecomputer();
       this.subjuct.buycomputer();
       this.aftercomputer();
   }

}
class Factory{
    public static ISubjuct getInstance(){
        return new ProxySubject(new RealSubject());
    }
}
public class Subjuct {
    public static void main(String[] args) {
        ISubjuct subjuct=Factory.getInstance();
        subjuct.buycomputer();

    }
}
