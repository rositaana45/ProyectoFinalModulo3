package FactoryDevices;

public class FactoryDevice {
    public enum DeviceType{
        ANDROID,
        ANDROID2,
        IOS,

    }
    public static IDevice make (DeviceType type){
        IDevice iDevice ;

        switch (type){
            case ANDROID:
                iDevice= new Android();
                break;
            case ANDROID2:
                iDevice=new Android2();
                break;
            case IOS:
                iDevice= new IOs();
                break;
            default:
                iDevice= new Android();
                break;
        }
        return iDevice ;
    }
}
