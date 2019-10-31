package bit;

/**
 * @Author: BaiMiao
 * @Description:工厂方法模式
 */
interface Computer{
    void printComputer();
}
class MAC implements Computer{
    public void printComputer(){
        System.out.println("this is a MAC computer");
    }
}
class DELL implements Computer{
    public void printComputer(){
        System.out.println("this is a DELL computer");
    }
}
interface ComputerFactory{
    Computer createcomputer();
}
class MACFactory implements ComputerFactory{
    public Computer createcomputer(){
        return new MAC();
    }
}
class DELLFactory implements ComputerFactory{
    public Computer createcomputer(){
        return new DELL();
    }
}

public class Client {
    public void buycomputer(Computer computer){
        computer.printComputer();
    }

    public static void main(String[] args) {
        Client client=new Client();
        ComputerFactory factory=new MACFactory();
        client.buycomputer(factory.createcomputer());
    }
}
