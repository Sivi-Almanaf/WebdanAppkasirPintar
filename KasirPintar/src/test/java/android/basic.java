package android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class basic extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();

        driver.findElementById("org.owline.kasirpintar:id/fab").click();
        driver.findElementById("org.owline.kasirpintar:id/editEmail").click();
        driver.findElementById("org.owline.kasirpintar:id/editEmail").sendKeys("salmanashahab@gmail.com");
        driver.findElementById("org.owline.kasirpintar:id/editPassword").click();
        driver.findElementById("org.owline.kasirpintar:id/editPassword").sendKeys("qwerty12345");
        driver.findElementById("org.owline.kasirpintar:id/buttLogin").click();


        driver.closeApp();


    }
}

