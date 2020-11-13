package demo02;

public class demoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        Usb usb = new Mouse();
        computer.useDevice(usb);
        Keybord keybord = new Keybord();
        computer.useDevice(keybord);
        computer.powerOff();
    }
}
