package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nahid");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Amin");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("347-748-5256");
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("nahidaminn@gmail.com");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("1111 white plans road");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bronx");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NYC");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("10472");


        WebElement staticDropDown = driver.findElement(By.xpath("//select[@name= 'country']"));

         Select dropDown  = new Select(staticDropDown);

                Thread.sleep(3000);
        dropDown.selectByVisibleText("BANGLADESH");
      Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Nahid1541");
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("WorryAbout");
         driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("WorryAbout");
         driver.findElement(By.xpath("//input[@name='submit']")).click();
       String gettext=  driver.findElement(By.xpath("//b[normalize-space()='Note: Your user name is Nahid1541.']")).getText();
       System.out.println(gettext);


    }
}
