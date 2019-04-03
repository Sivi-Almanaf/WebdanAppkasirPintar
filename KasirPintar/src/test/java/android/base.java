package android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {
    public static AndroidDriver capabilities () throws MalformedURLException {
        File f=new File("apk");
        File fs=new File(f,"org.owline.kasirpintar_2019-03-26.apk");

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"BGO-DL09");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");
//        caps.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.owline.kasirpintar");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".SplashScreen");
        AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);

        return driver;
    }
}

