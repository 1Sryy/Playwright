package playwright;

import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class Screenshot {

    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();

            page.navigate("https://www.google.com");
           

            page.fill("//textarea[@class='gLFyf']", "facebook.com");
            page.click("//div[@jsname='VlcLAe']//input[@value='Google Search']");
          

            page.click("//h3[text()='Facebook - log in or sign up']");
            

            page.fill("//input[@class='inputtext _55r1 _6luy']", "chetanaremarati@gmail.com");
            page.fill("//input[@class='inputtext _55r1 _6luy _9npi']", "Chetan@007");

            
            String screenshotPath = "C:\\screenshot\\Example.png";
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(screenshotPath)));
            //page.click("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']");
         

          

       
        }
    }
}