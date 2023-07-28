package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class open_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Playwright pw = Playwright.create();
		  Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  Page p = bw.newPage();
		  p.navigate("https://www.google.com");
		  Locator search = p.locator("//textarea[@class='gLFyf']");
		  search.type("facebook.com");
		  Locator Enter = p.locator("//div[@jsname='VlcLAe']//input[@value='Google Search']");
		  Enter.click();
		  
		  Locator Link =p.locator("//h3[text()='Facebook - log in or sign up']");
		  Link.click();
		   
		  Locator Email =p.locator("//input[@class='inputtext _55r1 _6luy']");
		  Email.click();
		  Email.type("chetanaremarati@gmail.com");
		  
		  Locator password =p.locator("//input[@class='inputtext _55r1 _6luy _9npi']");
		  password.click();
		  password.type("Chetan@007");
		  
		  Locator login =p.locator("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']");
		  login.click();
		  
		  
	}

}
