package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.nopcommerce.com/");
    }
}
