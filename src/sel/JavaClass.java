package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/////tagname[@attribute=“value of attribute”]///


public class JavaClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Nahid");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Amin");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nahidaminnyc@gmail.com");
        driver.findElement(By.xpath("//label[text()='Male'] ")).click();
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("347-748-5456");
        driver.findElement(By.id("id=dateOfBirthInput")).clear();
        driver.findElement(By.id("id=dateOfBirthInput")).sendKeys("08 aug 2000");
       Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@ class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("heyyy");

        driver.findElement(By.xpath("label[for='hobbies-checkbox-1']")).click();





        //input[@placeholder='First Name']'
        //input[@id='lastName']
        //input[@id='userEmail']
         //input[@placeholder='Mobile Number']
        //label[text()='Male']  .click()

                //div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']


    }
}
