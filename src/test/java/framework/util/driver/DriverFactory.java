package framework.util.driver;

import framework.enums.Browser;
import io.cucumber.java.hu.De;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URI;


@Component
public class DriverFactory {


    private static String pathFormat = System.getProperty("user.dir") + "/src/test/resources/driver/windows/%s";

    @Value("${grid.url}")
    private String gridUrl;

    @Value("${remote.execution}")
    private boolean remoteExecution;



    public  WebDriver get(Browser browser) throws MalformedURLException {

        if (remoteExecution)
           return getRemoteWebDriver(browser);


        if (Browser.chrome == browser) {
            System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "chromedriver.exe"));

            return new ChromeDriver();
        }
        if (Browser.firefox == browser) {
                    System.setProperty("webdriver.gecko.driver", String.format(pathFormat, "geckodriver.exe"));

            return new FirefoxDriver();

        }

        throw new IllegalArgumentException("Driver not found for browser: " + browser);
    }

    private RemoteWebDriver getRemoteWebDriver(Browser browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser.name());

        return new RemoteWebDriver(URI.create(gridUrl).toURL(), capabilities);
    }
}
