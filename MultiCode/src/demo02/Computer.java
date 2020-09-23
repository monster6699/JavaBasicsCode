package demo02;

public class Computer {
    public void  powerOn() {
        System.out.println("打开电脑");
    }

    public void powerOff(){
        System.out.println("关闭电脑");
    }

    public void  useDevice(Usb usb) {
        usb.powerOn();
        if(usb instanceof Keybord){
            Keybord keybord = (Keybord) usb;
            keybord.clickKeybord();
        }
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.clickMouse();
        }
        usb.powerOff();
    }
}