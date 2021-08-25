package spring09autowire;
//主体类    ----用电脑类    主体类依赖电脑类
public class Student {
    private Computer computer;
    private GameInterface gameInterface;

    public Student(GameInterface gameInterface) {
        this.gameInterface = gameInterface;
    }

    public Computer getComputer() {
        return computer;
    }

    /*public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Student(){
        System.out.println("我是学生类，学生对象被创建了");
    }
*/
    public void play(){
        System.out.println("学生 玩");
        //computer.game();
        gameInterface.game();
    }
}
