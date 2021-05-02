package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.SignUpPO;
import pageobject.SignUpServices;
import util.RandomNumberGenerator;

public class SignUpStepDefs {

    @Given("^Jose wants to have an account$")
    public void jose_wants_to_have_an_account() throws Throwable {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/windows/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        SignUpServices signUpServices = new SignUpServices(driver);
        signUpServices.go("http://demo.automationtesting.in/Register.html");
        signUpServices.writeFirstName("Jose");
        signUpServices.writeLastName("membs");
        signUpServices.writeEmail("test@mail.com");
        signUpServices.writePhone(RandomNumberGenerator.get());
        signUpServices.selectMale();
        Thread.sleep( 3000);
        signUpServices.selectCountry("Spain");
        signUpServices.selectBirthDay("13");
        signUpServices.selectBirthMonth("September");
        signUpServices.selectBirthYear("1992");
        signUpServices.writePassword("Mtest22");
        signUpServices.writeConfirmPassword("Mtest22");
        signUpServices.clickOnSubmit();

        Thread.sleep( 8000);
        driver.quit();
    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws Throwable {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() throws Throwable {

    }


}
