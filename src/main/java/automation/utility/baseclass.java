package automation.utility;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

    public static void main(String args[]){


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://launchhybridworkspace.galaxkeydemo.com:501/");
        driver.manage().window().maximize();
        driver.quit();
    }
    
}
