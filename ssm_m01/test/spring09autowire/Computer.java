package spring09autowire;

public class Computer implements GameInterface{
    public Computer(){
        System.out.println("电脑对象创建");
    }

    public void game(){
        System.out.println("电脑运行cf");
    }
}
