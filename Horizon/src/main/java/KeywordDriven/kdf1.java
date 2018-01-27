package KeywordDriven;

import home.ViewFields;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kdf1 extends ViewFields {
    public void setDataKdf1(){
        providerLocation();
        searchByZipcode();
        clicksearchbtn();
    }
    public void setDataKdf2(){
        providerLocation();
        searchByCounty();
        clicksearchbtn();
    }
}