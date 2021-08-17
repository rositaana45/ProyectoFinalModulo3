package Session;

import FactoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;

public class Session {
    //tener un atributo del mismo tipo
    private  static Session instance=null;
    private AppiumDriver driver;
    // tener un constructor privado
    private Session() throws MalformedURLException {
        //driver= FactoryDevice.make(FactoryDevice.DeviceType.ANDROID).create();
        driver= FactoryDevice.make(FactoryDevice.DeviceType.ANDROID2).create();

    }
    //tener un metodo estatico que retorne la instancia unica
    public static Session getInstance() throws MalformedURLException {
        if(instance==null)
            instance=new Session();
        return instance;
    }
    public  void  closeSession(){
        driver.quit();
        instance=null;
    }
    public AppiumDriver getDriver(){
        return driver;
    }
    //para que sea mas generico se ha creado en esta clase

}
