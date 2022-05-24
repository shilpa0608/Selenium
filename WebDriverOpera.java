package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverOpera {

        public static void main(String[] args) {
            System.setProperty("webdriver.opera.driver","C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\operadriver.exe");

            WebDriver driver = new OperaDriver();
            //step:3 Navigate to webpage
            driver.get("https://www.nopcommerce.com/");
        }
    }

