package framework.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HookDriver;
import framework.pageobject.SignUpServices;
import framework.util.RandomNumberGenerator;

public class SignUpStepDefs {



    @Given("^Jose wants to have an account$")
    public void jose_wants_to_have_an_account() throws InterruptedException {


        SignUpServices signUpServices = new SignUpServices(HookDriver.driver);
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

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws Throwable {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() throws Throwable {

    }


}
