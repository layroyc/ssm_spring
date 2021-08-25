package spring03fanshe;

import spring02ouhe.Usb;

public class FactoryBeans {
    public static Usb getInstance(String ClassName){
        Usb usb =null;
        try {
            usb = (Usb)Class.forName(ClassName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usb;
    }
}
