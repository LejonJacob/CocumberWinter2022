import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid2 {


    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.116.174:4444"), new FirefoxOptions());

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

    }
}
