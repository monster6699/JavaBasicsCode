package demo02;

public class Mouse implements Usb {
    @Override
    public void powerOn() {
        System.out.println("打开鼠标");
    }

    @Override
    public void powerOff() {
        System.out.println("关闭鼠标");
    }

    public void clickMouse() {
        System.out.println("点击鼠标");
    }
}
