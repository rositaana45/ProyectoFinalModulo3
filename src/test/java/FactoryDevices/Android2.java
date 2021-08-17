package FactoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android2 implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy A50");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","com.angkormobi.ukcalendar");
        capabilities.setCapability("appActivity",".activities.MainActivity");
        capabilities.setCapability("plataformName","Android");

        AppiumDriver appiumDriver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return appiumDriver;
    }
}
