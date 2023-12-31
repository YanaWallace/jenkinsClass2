package pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeSearchPage extends CommonMethods {
    @FindBy(id="empsearch_id")
    public WebElement idTextField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement nameTextField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;
    public EmployeeSearchPage(){
        PageFactory.initElements(driver,this);
    }

}
