package Helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.*;

public class Takescreen {
    public static String tc_dir = System.getProperty("user.dir") + " ";

    public static WebDriver driver = null;

    public Takescreen(WebDriver driver) {
        this.driver = driver;
    }

    public void takescnsht(String scname, WebDriver driver) {
        TakesScreenshot tc = (TakesScreenshot) driver;
        File src = tc.getScreenshotAs(OutputType.FILE);

        File destination = new File(tc_dir, scname + ".png");

        try
        {
            FileUtils.copyFile(src,destination);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


