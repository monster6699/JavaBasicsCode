package demo02;

public class Keybord implements Usb {
    @Override
    public void powerOn() {
        System.out.println("打开键盘");
    }

    @Override
    public void powerOff() {
        System.out.println("关闭键盘");
    }

    public void clickKeybord() {
        System.out.println("敲击键盘");
    }
}
