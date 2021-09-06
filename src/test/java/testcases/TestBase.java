package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    //atributo
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @AfterClass
    public void close(){
        driver.close();
    }


}
