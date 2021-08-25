package spring07;
//主体
public class Person {
    public Person(){
        System.out.println("人在容器中诞生了");
    }
    //接口
    private Eats eats;

    public void setEats(Eats eats) {
        this.eats = eats;
    }
    public void task(){
        System.out.println("吃的方法");
        eats.eat();
    }
}
