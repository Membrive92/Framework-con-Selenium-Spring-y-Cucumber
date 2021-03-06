package framework.pageobject;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SignUpPO extends PageBase {

    @Autowired
    public SignUpPO(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement genderFemale;

    @FindBy(id = "countries")
    private WebElement country;

    @FindBy(id = "yearbox")
    private WebElement birthYearDate;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement birthMonthDate;

    @FindBy(id = "daybox")
    private WebElement birthDayDate;

    @FindBy(id = "firstpassword")
    private WebElement password;

    @FindBy(id = "secondpassword")
    private WebElement confirmpassword;

    @FindBy(id = "submitbtn")
    private WebElement submit;


}
