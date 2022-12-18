package GridSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid3 {
    public static void main(String[] args) throws MalformedURLException {

        // Desired capabilities olustur

        DesiredCapabilities cap = new DesiredCapabilities();

        // 1) Desired kapabilities icerisine koyulacaklari hazirla

        // a) isletim sistemi

        cap.setPlatform(Platform.ANY);

        // b) browser name

        cap.setBrowserName("Chrome");

        // c) browser version

        cap.setVersion("108.0.5359.99");

        //2)  options olusturma

        ChromeOptions options = new ChromeOptions();

        options.merge(cap);


        String hubURL = "http://192.168.116.174:4444";


        // 3) Kodlama
        WebDriver driver = new RemoteWebDriver(new URL(hubURL),options);

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//div[text()=\"Tümünü reddet\"]")).click();

        System.out.println(driver.getTitle());


        System.out.println(driver.getCurrentUrl());

    }
}
