package SeleniumSession2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class LocatorEdge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("Email")).sendKeys("tester123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Happy@123");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();


    }
}
