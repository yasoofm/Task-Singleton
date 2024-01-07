package Singleton;
public class IphoneSettings {
    private static IphoneSettings instance;
    private static int brightness;
    private static boolean wifi;
    private static int volume;
    
    private IphoneSettings(){

    }

    public static synchronized IphoneSettings getInstance(){
        if(instance == null){
            instance = new IphoneSettings();
        }

        return instance;
    }

    public static void setBrightness(int brightness){
        IphoneSettings.brightness = brightness;
    }

    public static int getBrightness(){
        return brightness;
    }

    public static void setWifi(boolean wifi){
        IphoneSettings.wifi = wifi;
    }

    public static boolean getWifi(){
        return wifi;
    }

    public static void setVolume(int volume){
        IphoneSettings.volume = volume;
    }

    public static int getVolume(){
        return volume;
    }
}
