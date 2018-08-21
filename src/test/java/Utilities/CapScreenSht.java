package Utilities;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by balajakka on 21/08/2018.
 */
public class CapScreenSht {

    public void CapScrSht(WebDriver driver, String screenShotName){

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source,new File("./Src/test/Screenshots/"+screenShotName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
