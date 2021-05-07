package framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PageBase {

    @Autowired
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
