package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static stepDefinitions.HookTest.driver;

/**
 * Created by balajakka on 03/09/2018.
 */
public class LadbrokesStepDef {


    Actions a;
    WebElement element;

   @Given("^I am a chrome user$")
   public void i_am_a_chrome_user() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("^I access ladbrokes url$")
    public void i_access_ladbrokes_site(){

        driver.get("https://www.ladbrokes.com/home/ie");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.xpath("//a[@class=\"cta green-new cta-small create-account hide visible-lg joinnow-btn popUpJoin\"]")).click();
        System.out.println(driver.getTitle());
        WebElement frame = driver.findElement(By.xpath("//iframe[@src=\"https://accountone.ladbrokes.com/ie/register?back_url=http%3A%2F%2Fsports.ladbrokes.com&hideClose=true&clientType=sportsbook&clientPlatform=web&clientChannel=I&system_source=OBE&system_source_id=OBS_WEB\"]"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("BALA");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("JAKKA");

        Select dateDropDown = new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
        dateDropDown.selectByIndex(15);

        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
        monthDropDown.selectByIndex(10);

        Select yearDropDown = new Select (driver.findElement(By.xpath("//select[@id=\"year\"]")));
        yearDropDown.selectByValue("1980");

        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("bala.jakka@icloud.com");

    }
    @Then("^I see confirmation details")
    public void i_see_conf_details(){
        System.out.println("Test Sucess");
    }
}
