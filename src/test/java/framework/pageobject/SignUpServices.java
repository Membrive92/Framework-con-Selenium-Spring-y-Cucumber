package framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {


    private WebDriver driver;

    @Autowired
    private SignUpPO signUpPO;

    @Autowired
    public SignUpServices(WebDriver driver) {
        this.driver = driver;
    }
    public void go(String url){
        this.driver.get(url);
    }

    public void writeFirstName(String firstname){

        this.signUpPO.getFirstName().sendKeys(firstname);
    }

    public void writeLastName(String lastname){
        this.signUpPO.getLastName().sendKeys(lastname);
    }

    public void writeEmail(String email){
        this.signUpPO.getEmailAddress().sendKeys(email);
    }

    public void writePhone(String phone){
        this.signUpPO.getPhone().sendKeys(phone);
    }

    public void selectMale(){
        this.signUpPO.getGenderMale().click();
    }

    public void selectFemale(){
        this.signUpPO.getGenderFemale().click();
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
