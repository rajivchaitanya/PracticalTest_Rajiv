package stepDefinitions;


import Page.PageModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.apache.commons.lang3.BooleanUtils.and;


public class StepDef extends PageModel {
    Integer balance;
    @Given("I have the kiwisaver retirement calculator")
    public void openTheKiwisaverRetirementCalculator() {
        // Write code here that turns the phrase above into concrete actions

        openwebdriver("https://www.westpac.co.nz/");
        menusection.click();
        Kiwsavercalc.click();
    }

    @When("^i have the input for retirement page \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iHaveTheInputForRetirementPageAndAndAndAndRiskmediumSavingsgoal(String age, String empl, String PIR, String Ksbal, String Volcont , String Riskmedium,String Savingsgoal)  {


    }

    @When("^Check information icons$")
    public void allTheInformationIconPresent() {

        Assert.assertTrue(Ageicon.isDisplayed());
        Assert.assertTrue(salicon.isDisplayed());
        Assert.assertTrue(Emplstatusicon.isDisplayed());
        Assert.assertTrue(piricon.isDisplayed());
        Assert.assertTrue(kiwisavrbalicon.isDisplayed());
        Assert.assertTrue(volcontricon.isDisplayed());
        Assert.assertTrue(riskproflicon.isDisplayed());
        Assert.assertTrue(savinggoalicon.isDisplayed());
        click(currentageicon);
    }

    @Then("^Click and Check the current age information message$")
    public void checkTheCurrentAgeInformationIconMessage() {
        String expctdmessage = "This calculator has an age limit of 84 years old";
        String actmessage = displaymsg.toString();
        Assert.assertEquals(expctdmessage, actmessage);
    }

    @Then("^It should return balances at retirement \"([^\"]*)\"$")
    public void itShouldReturnBalancesAtRetirement(String Balance) {
        click(submit);
        String bal = balance.toString();
        Assert.assertEquals(bal,Balance);
        }

    @When("^i have the input for retirement page \"([^\"]*)\"  and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iHaveTheInputForRetirementPageAndAndAnd(String age, String PIR, String Ksbal, String Freq) {
        textfield(Age,age);
        selectdropdown(pir,PIR);
        textfield(ksbal,Ksbal);
        if (!Freq.contentEquals("N")) {
            selectdropdown(freq, Freq);
        }
    }







    @And("^i have the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iHaveTheAndAnd(int sal, String empl, int Memcontrib)  {
        selectdropdown(EmplStatus,empl);
        if (sal > 0) {

            switch(Memcontrib) {
                case 3: {
                    click(threepercent);
                }
                case 4: {
                    click(fourpercent);
                }
                case 6: {
                    click(sixpercent);
                }
                case 8: {
                    click(eightpercent);
                }
                case 10: {
                    click(tenpercent);
                }
            }
        }

    }



    @And("^i have the \"([^\"]*)\" and \"([^\"]*)\" and <contrib>$")
    public void iHaveTheAndAndContrib(String Risk, String Savingsgoal,String Volcont)  {
        textfield(volcont,Volcont);
        Risks risk = Risks.valueOf(Risk.toUpperCase());

        switch (risk) {
            case H:
                checkbox(riskhigh);
            case M:
                checkbox(riskmedium);
            default:
                checkbox(risklow);
        }

        textfield(savingsgoal,Savingsgoal);
    }
}










