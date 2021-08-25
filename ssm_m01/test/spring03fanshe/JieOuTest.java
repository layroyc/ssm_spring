package spring03fanshe;

import org.junit.Test;
import spring02ouhe.Usb;

public class JieOuTest {
    @Test
    public void Test01(){
        //2.以文本形式，找到出处，很常用
       /* try {
            Class<Computer> aClass = (Class<Computer>) Class.forName("spring02ouhe.Computer");
            System.out.println("aClasss = " + aClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Usb u = FactoryBeans.getInstance("spring02ouhe.MyTv");
        Usb us = FactoryBeans.getInstance("spring02ouhe.Mp4");
        Usb usb = FactoryBeans.getInstance("spring02ouhe.Computer");
        u.usbData();
        us.usbData();
        usb.usbData();
    }
}
