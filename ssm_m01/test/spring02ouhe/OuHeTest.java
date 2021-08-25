package spring02ouhe;

import org.junit.Test;

public class OuHeTest {
    //创建几个类 模拟耦合
    @Test
    public void test01() throws Exception {
        //如果使用电脑传输
        /*Computer computer = new Computer();   //将来要改Computer
        computer.usbData();*/
        //如果使用电视传输
        /*MyTv myTv = new MyTv();
        myTv.usbData();*/

        //更新接口后，代码优化了，解耦1次
       // Usb u = new MyTv();
       // Usb u = new Computer();
       /* Usb u = new Mp4();
        u.usbData();*/

        //需求1 :现在 new Computer();  new MyTv();  都有 usbData的功能
        //问题：直接修改  代码修改量比较大
        //想把Computer类不用，修改成TV，
        //要求 只修改
        // 那么 需要把 usbData方法提取出来 成接口  然后 使用多态的思想 进行 代码更新  解耦1次
        //第一次 使用接口 多态的思想 解耦, 好处是 可以 多次修改代码  不用改变量了，直接 一个 u 就可以代替上面的new对象
        //第二次解耦，即代码更方便

        /*Usb u = FactoryBean.getInstance("MyTv");
        u.usbData();*/

        Usb u = FactoryBean.getInstance("spring02ouhe.Computer");
        u.usbData();
        //以上 第二次写法是不是更优美，更解耦了，让用户输入字符，比打开源代码 找到第几行，更方便，将来代码是要加密


    }
}
