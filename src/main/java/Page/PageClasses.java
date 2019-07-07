package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageClasses  {
    @FindBy(xpath = "//*[@id=\"ubermenu-section-link-kiwisaver-ps\"])")
   public WebElement menusection;
    @FindBy(xpath = "//*[@id=\"ubermenu-item-cta-kiwisaver-calculators-ps\"]")
   public WebElement Kiwsavercalc;
    @FindBy(xpath = "//*[@id=\"sidenav-responsive-children-title-4825-ps\"]/span")
   public WebElement rskprofiler;
    @FindBy(xpath = "//*[@id=\"responsive-children-title-3956-ps\"]/span")
   public WebElement retcalcprofiler;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input\n")
   public WebElement Age;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div")
   public WebElement EmplStatus;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div")
   public WebElement pir;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
   public WebElement ksbal;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input\n")
   public WebElement volcont;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/span")
   public WebElement freq;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[1]/div/label\n")
   public WebElement risklow;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/label/span[2]/span")
   public WebElement riskmedium;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[3]/div/label")
   public WebElement riskhigh;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
   public WebElement savingsgoal;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[2]/button")
   public WebElement submit;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/span[2]\n")
   public WebElement balance;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/span[2]\n")
    public WebElement displaymsg;
   @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i")
   public WebElement currentageicon;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement Ageicon;
    @FindBy (xpath= "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement salicon;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement Emplstatusicon;
    @FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement piricon;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement kiwisavrbalicon;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement volcontricon;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[9]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement riskproflicon;
    @FindBy (xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[10]/div/div/div/div[2]/div[2]/div/div/div/button/i")
    public WebElement savinggoalicon;
    @FindBy (xpath = "//*[@id=\"radio-option-06B\"]")
    public WebElement threepercent;
    @FindBy (xpath = "//*[@id=\"radio-option-06E\"]")
    public WebElement fourpercent;
    @FindBy (xpath = "//*[@id=\"radio-option-06H\"]")
    public WebElement sixpercent;
    @FindBy (xpath = "//*[@id=\"radio-option-06K\"]")
    public WebElement eightpercent;
    @FindBy (xpath = "//*[@id=\"radio-option-06N\"]")
    public WebElement tenpercent;


}
