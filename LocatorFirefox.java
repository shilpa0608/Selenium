package SeleniumSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorFirefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("Email")).sendKeys("Master123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Sairam@123");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();


    }
}
