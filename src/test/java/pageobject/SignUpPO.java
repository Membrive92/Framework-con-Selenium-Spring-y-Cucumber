package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPO {

    private final WebDriver driver;

    public SignUpPO(WebDriver driver){
        this.driver = driver;
    }

    private By firstName = By.xpath("//input[@ng-model='FirstName']");

    private By lastName = By.xpath("//input[@ng-model='LastName']");

    private By emailAddress = By.xpath("//input[@type='email']");

    private By phone = By.xpath("//input[@type='tel']");

    private By genderMale = By.xpath("//input[@value='Male']");

    private By genderFemale = By.xpath("//input[@value='Female']");

    private By country = By.id("countries");

    private By birthYearDate = By.id("yearbox");

    private By birthMonthDate = By.xpath("//select[@ng-model='monthbox']");

    private By birthDayDate = By.id("daybox");

    private By password = By.id("firstpassword");

    private By confirmpassword = By.id("secondpassword");

    private By submit = By.id("submitbtn");

    public void writeFirstName(String firstname){
        this.driver.findElement(this.firstName).sendKeys(firstname);
    }

    public void writeLastName(String lastname){
        this.driver.findElement(this.lastName).sendKeys(lastname);
    }

    public void writeEmail(String email){
        this.driver.findElement(this.emailAddress).sendKeys(email);
    }

    public void writePhone(String phone){
        this.driver.findElement(this.phone).sendKeys(phone);
    }

    public void selectMale(){
        this.driver.findElement(this.genderMale).click();
    }

    public void selectFemale(){
        this.driver.findElement(this.genderFemale).click();
    }

    public void selectCountry(String country){
        this.driver.findElement(this.country).sendKeys(country);
    }

    public void selectBirthDay(String day){
        this.driver.findElement(this.birthDayDate).sendKeys(day);
    }

    public void selectBirthMonth(String month){
        this.driver.findElement(this.birthMonthDate).sendKeys(month);
    }
    public void selectBirthYear(String year){
        this.driver.findElement(this.birthYearDate).sendKeys(year);
    }

    public void writePassword(String password){
        this.driver.findElement(this.password).sendKeys(password);
    }

    public void writeConfirmPassword(String password){
        this.driver.findElement(this.confirmpassword).sendKeys(password);
    }

    public void clickOnSubmit(){
        this.driver.findElement(submit).click();
    }
}
