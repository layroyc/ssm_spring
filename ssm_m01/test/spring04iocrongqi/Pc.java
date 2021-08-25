package spring04iocrongqi;

public class Pc {
    public Pc(){
        System.out.println(" 无参构造，就是 对象一诞生就会执行的方法，比如；人一哭，就是构造方法" );
        System.out.println("构造方法 是 对象一诞生就会执行的方法  一般多用来 初始化自己的属性，比如：颜色");

    }

    public void initShow(){
        System.out.println("开机");
        System.out.println("电脑的初始化工作 是 对象一诞生就会执行的方法 和构造方法不同的是 他多用于直接调用自己的方法");
    }

    //对象的普通方法  周期中
    public void playGame(){
        System.out.println("对象的普通方法  打游戏");
    }

    //对象的死亡方法，参与过滤器  servlet
    public void destoryObj(){
        System.out.println("电脑死亡了,执行的方法");
    }
}
