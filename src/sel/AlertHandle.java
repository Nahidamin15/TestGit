package sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
       WebElement AlertButt= driver.findElement(By.id("alertButton"));
        AlertButt.click();
        Alert alert1 =driver.switchTo().alert();
        alert1.accept();


        WebElement TimerAlertButt= driver.findElement(By.id("timerAlertButton"));
        TimerAlertButt.click();
        Thread.sleep(3000);
        Alert alert2 =driver.switchTo().alert();
        alert2.accept();
       Thread.sleep(2000);


        WebElement ConfirmButt=  driver.findElement(By.id("confirmButton"));
            ConfirmButt.click();
         Alert alert3 =driver.switchTo().alert();
          alert3.accept();



           WebElement PromtButt= driver.findElement(By.id("promtButton"));
                PromtButt.click();
                 Thread.sleep(3000);
                Alert Alert4 = driver.switchTo().alert();
             Alert4.sendKeys("Hey you slow");
             Alert4.accept();







    }
}
