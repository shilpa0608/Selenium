package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.nopcommerce.com/");
    }
}
