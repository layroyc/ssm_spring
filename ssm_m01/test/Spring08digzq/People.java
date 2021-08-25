package Spring08digzq;

public class People {
    //有参构造
    private Pad pad;

    public People(){
        System.out.println("人对象被创建");
    }

    public People(Pad pad){
        this.pad = pad;
    }
    public void play(){
        System.out.println("人玩的方法");
        pad.game();
    }
}
