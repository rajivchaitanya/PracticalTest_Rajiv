package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageModel extends PageClasses {

    public static WebDriver driver;
        public void openwebdriver(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajita.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        return;
    }
    public void pagemodel(WebDriver driver,String str)
    {
        PageFactory.initElements(this.driver,this);
        this.driver.manage().window().maximize();
    }

    public void textfield(WebElement textbox , String str)

    {
         textbox.sendKeys(str);
    }

    public void selectdropdown(WebElement dropdown , String option)
    {
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }
    public void checkbox(WebElement CheckBox)
    {
        boolean checkstatus;
        checkstatus = CheckBox.isSelected();
    }

    public void click(WebElement clicklink)
    {
        clicklink.click();
    }

    public enum Risks
    {
        H,
        M,
        L
    }
}
