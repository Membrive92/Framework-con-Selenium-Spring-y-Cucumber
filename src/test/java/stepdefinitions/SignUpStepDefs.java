package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.SignUpPO;
import util.RandomNumberGenerator;

public class SignUpStepDefs {

    @Given("^Jose wants to have an account$")
    public void jose_wants_to_have_an_account() throws Throwable {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/windows/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        SignUpPO signUpPO = new SignUpPO(driver);
        signUpPO.go("http://demo.automationtesting.in/Register.html");
        signUpPO.writeFirstName("Jose");
        signUpPO.writeLastName("membs");
        signUpPO.writeEmail("test@mail.com");
        signUpPO.writePhone(RandomNumberGenerator.get());
        signUpPO.selectMale();
        signUpPO.selectCountry("Spain");
        signUpPO.selectBirthDay("13");
        signUpPO.selectBirthMonth("September");
        signUpPO.selectBirthYear("1992");
        signUpPO.writePassword("Mtest22");
        signUpPO.writeConfirmPassword("Mtest22");
        signUpPO.clickOnSubmit();

        Thread.sleep( 4000);
        driver.quit();
    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws Throwable {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() throws Throwable {

    }


}
