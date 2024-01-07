package Singleton;

public class App {
    public static void main(String[] args){

        IphoneSettings instance = IphoneSettings.getInstance();
        IphoneSettings instance2 = IphoneSettings.getInstance();
        instance.setBrightness(50);
        instance.setWifi(true);
        instance2.setBrightness(100);
        instance2.setWifi(false);
        System.out.println(instance.getBrightness());
        System.out.println(instance.getWifi());
        System.out.println(instance2.getBrightness());
        System.out.println(instance2.getWifi());

    }
}
