package _01_FridayProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLocator {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lidl.com/register");


        WebElement inputFirst = driver.findElement(By.id("input0"));
        inputFirst.click();
        inputFirst.sendKeys("cankut");

        WebElement inputSurname = driver.findElement(By.id("input1"));
        inputSurname.click();
        inputSurname.sendKeys("Sogancilar");

        WebElement inputMail = driver.findElement(By.id("input2"));
        inputMail.click();
        inputMail.sendKeys("cankutsogancilar@gmail.com");

        WebElement inputConfirmMail = driver.findElement(By.id("input3"));
        inputConfirmMail.click();
        inputConfirmMail.sendKeys("cankutsogancilar@gmail.com");

        WebElement inputPassword=driver.findElement(By.id("input4"));
        inputPassword.click();
        inputPassword.sendKeys("Cankut1.");

        WebElement inputPhone=driver.findElement(By.id("input5"));
        inputPhone.sendKeys("5324674583");

        WebElement zipCode=driver.findElement(By.id("input6"));
        zipCode.sendKeys("12345");

        WebElement birthday=driver.findElement(By.id("date-picker-dialog"));
        birthday.sendKeys("04121985");

        WebElement adressL=driver.findElement(By.id("input7"));
        adressL.sendKeys("vista magnolia");

        WebElement city=driver.findElement(By.id("input8"));
        city.sendKeys("Orlando");

        WebElement State=driver.findElement(By.id("select0"));
        State.click();
        State.sendKeys("Florida");

        WebElement bbutton=driver.findElement(By.className("square"));
        bbutton.click();


        WebElement button=driver.findElement(By.className("spinnie-circular"));
        button.click();


        try{
            Thread.sleep(5555);
        }catch (Exception e){

        }
        driver.quit();


    }
}
