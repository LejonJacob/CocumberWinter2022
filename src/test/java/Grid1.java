import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid1 {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.116.174:4444"), new ChromeOptions());

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//div[text()=\"Tümünü reddet\"]")).click();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

    }


}
