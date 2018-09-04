package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by balajakka on 04/09/2018.
 */
public class HookTest {

        static WebDriver driver;


        @Before
        public void beforeScenario(){
            System.out.println("This will run before the Scenario");
            System.setProperty("webdriver.chrome.driver", "./src/test/java/utilities/chromedriver");
            driver = new ChromeDriver();

        }

        @After
        public void afterScenario(){
            System.out.println("This will run after the Scenario");
            driver.quit();
        }
}
