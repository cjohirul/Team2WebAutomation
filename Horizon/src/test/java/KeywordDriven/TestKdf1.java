package KeywordDriven;

import org.testng.annotations.Test;

public class TestKdf1 extends kdf1 {
    @Test
    public void searchByZipcodeProvider (){
        setDataKdf1();
        System.out.println("Passed SearchByZipcode 07801");
    }
    @Test
    public void searchByCountyProvider(){
        setDataKdf2();
        System.out.println("Passed SearchByCounty Somerset,NJ");
    }
}
