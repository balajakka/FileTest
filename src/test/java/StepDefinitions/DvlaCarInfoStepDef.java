package StepDefinitions;

import Utilities.CapScreenSht;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by balajakka on 21/08/2018.
 */
public class DvlaCarInfoStepDef  {

        WebDriver driver;

        @Given("^I am a chrome user$")
        public void I_am_a_chrome_user(){
            System.setProperty("webdriver.chrome.driver","./src/test/java/Utilities/chromedriver");
            driver = new ChromeDriver();

        }
        @When("^I access DVLA vehicle information page$")
        public void I_access_google_search_site(){

            driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
        }

        @And("^I click Start Now$")
        public void I_click_start_now(){
            driver.findElement(By.xpath("//a[@class=\"gem-c-button govuk-button govuk-button--start\"]")).click();

        }

        @And("^I input my car reg number$")
        public void I_input_my_car_reg_number(){
                driver.findElement(By.xpath("//input[@class=\"form-control form-control-1-4 input-upper\"]")).sendKeys("DA58FYW");
            }

        @And("I click Continue$")
        public void I_click_continue(){
                driver.findElement(By.xpath("//button[@name=\"Continue\"]")).click();

        }

        @Then("^I see DVLA vehicle information page$")
        public void I_will_see_Amazon_site() {
            Assert.assertEquals(driver.findElement(By.xpath("//a[@href=\"https://www.vehicleenquiry.service.gov.uk\"]")).isDisplayed(), true);
            new CapScreenSht().CapScrSht(driver, "scr1");
            driver.quit();
        }
        @Then("^I see my car make details$")
        public void I_see_my_car_make_details(){
            Assert.assertEquals(driver.findElement(By.xpath("//span[@class=\"reg-mark\"]")).getText(), "DA58 FYW");
            new CapScreenSht().CapScrSht(driver, "scr2");
            driver.quit();

            }

    }


