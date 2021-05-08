package framework.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Builders.data.UserBuilder;
import framework.conf.DriverConfig;
import framework.pageobject.SignUpServices;
import framework.tasks.NavigateTo;
import framework.tasks.UserSignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    @Autowired
    private UserSignUp signUpServices;

    @Value("${url}")
    private String url;

    @Autowired
    private NavigateTo navigate;

    @Given("^Jose wants to have an account$")
    public void jose_wants_to_have_an_account() {
        navigate.signUpPage();

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() throws InterruptedException {
        signUpServices.withInfo(
            UserBuilder
                    .anUser()
                    .but()
                    .withoutEmail()
                    .build()


        );
        Thread.sleep(7000);
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created()  {

    }


}
