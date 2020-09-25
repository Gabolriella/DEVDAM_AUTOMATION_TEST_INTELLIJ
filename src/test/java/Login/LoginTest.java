package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //import the selenium webDriver
    private WebDriver driver;
    //import the chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\SOREMI TAIWO OLAMIDE\\Documents\\DEVDAM_Automation_Test\\Resources\\chromedriver.exe");
    driver = new ChromeDriver();
    //Input project URL= Devdam Url
        driver.get ("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //waiting for globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage ().window ().maximize ();
        //get page title
        System.out.println (driver.getTitle ());
        //locate username field
        driver.findElement (By.xpath ("//*[@id=\"username\"]")).sendKeys ("TaiwoDevdam");
        //locate password field
        driver.findElement (By.xpath ("//*[@id=\"password\"]")).sendKeys ("1234abcd");
        //click on sign in button
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click ();
        Thread.sleep (10000);
        //close the browser after test
        driver.quit();
    }

    //initiate the test run command
    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest ();
        test.setUp ();
    }
}

