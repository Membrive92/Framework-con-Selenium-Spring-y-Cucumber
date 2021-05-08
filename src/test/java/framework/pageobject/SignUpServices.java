package framework.pageobject;

import framework.enums.Gender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private SignUpPO signUpPO;

    @Autowired
    WebDriverWait wait;


    public void go(String url){
        this.driver.get(url);
    }

    public void writeFirstName(String firstName){
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPO.getFirstName()));
        this.signUpPO.getFirstName().sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        this.signUpPO.getLastName().sendKeys(lastName);
    }

    public void writeEmail(String email){
        this.signUpPO.getEmailAddress().sendKeys(email);
    }

    public void writePhone(String phone){
        this.signUpPO.getPhone().sendKeys(phone);
    }

    private void selectMale(){
        this.signUpPO.getGenderMale().click();
    }

    private void selectFemale(){
        this.signUpPO.getGenderFemale().click();
    }

    public void selectGender(Gender gender){
        if (gender == Gender.female){
           selectFemale();
        } else {
            selectMale();
        }
    }

    public void selectCountry(String country){
        this.signUpPO.getCountry().sendKeys(country);
    }



    public void selectBirthDay(String day){

       this.signUpPO.getBirthDayDate().sendKeys(day);


    }

    public void selectBirthMonth(String month){

     this.signUpPO.getBirthMonthDate().sendKeys(month);


    }
    public void selectBirthYear(String year){

     this.signUpPO.getBirthYearDate().sendKeys(year);

    }

    public void writePassword(String password){
        this.signUpPO.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String password){
        this.signUpPO.getConfirmpassword().sendKeys(password);
    }

    public void clickOnSubmit(){
        this.signUpPO.getSubmit().click();
    }
}
