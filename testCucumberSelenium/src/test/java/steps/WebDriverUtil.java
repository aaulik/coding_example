package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.net.URL;

public final class WebDriverUtil {

    public static WebDriver WEB_DRIVER;

    public static void initializeWebDriver() {
        if (WEB_DRIVER == null) {
            URL url = Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe");
            File file = new File(url.getPath());
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            WEB_DRIVER = new ChromeDriver();
        }
    }
}
