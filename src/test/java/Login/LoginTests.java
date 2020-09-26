package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import the selenium driver

    private WebDriver driver;
    //import the chromeDriver
    public void setUp()throws InterruptedException{
        System.setProperty ("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver ();

        //input project URL = monosnap URL
        driver.get ("https://monosnap.com/#login");

        //waiting for globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);

        //maximize the window
        driver.manage ().window ().maximize ();
        //get page title
         System.out.println (driver.getTitle ());

       //Locate username fields
        driver.findElement (By.xpath ("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys("tundesanni023@gmail.com");

        //locate password fields
        driver.findElement(By.xpath ("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys("olashile!");

        // Click on the login button
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        Thread.sleep (7000);
        //close the browser after test
        driver.quit();

    }

    //initiate the test run command

    public static void main(String args[]) throws InterruptedException  {
        LoginTests test = new LoginTests();
        test.setUp();
    }



    }






