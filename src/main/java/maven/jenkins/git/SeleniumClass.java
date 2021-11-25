package maven.jenkins.git;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
	public static void main(String[] args) {

        // Get the title of the web page

        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

        //Initiating your web driver
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://maven.apache.org/what-is-maven.html";

        //Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open browser with desired URL
        driver.get(baseURL);

        String title = driver.getTitle();
        System.out.println(title);

        //closing the browser
        driver.close();

    }
}
