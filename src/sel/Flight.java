package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/reservation.php");

        driver.findElement(By.xpath("//input[@value='oneway']")).click();
        Thread.sleep(300);

            WebElement passnum= driver.findElement(By.xpath("//select[@name='passCount']"));

         Select pass= new Select(passnum);
         pass.selectByVisibleText("3");


        WebElement staticDropDown= driver.findElement(By.xpath("//select[@name='fromPort']"));

        Select dropDown  = new Select(staticDropDown);
        dropDown.selectByVisibleText("New York");



          driver.findElement(By.xpath("//select[@name='toMonth']")).sendKeys("August");
          driver.findElement(By.xpath("//input[@value='First']")).click();





    }
}
