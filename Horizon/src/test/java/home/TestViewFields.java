package home;

import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestViewFields extends ViewFields {
    @Test
    public void testViewFields01() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        geturl();
    }

    @Test
    public void testViewFields02() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pageBanner();
    }

    @Test
    public void testViewFields03() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTab();
    }

    @Test
    public void testViewFields04() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToOurPlans();
    }

    @Test
    public void testViewFields05() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToMembersSupport();
    }

    @Test
    public void testViewFields06() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToForProviders();
    }

    @Test
    public void testViewFields07() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkLogo();
    }

    @Test
    public void testViewFields08() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToContactUsByEmail();
    }

    @Test
    public void testViewFields09() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        linkReadMore();
    }

    @Test
    public void testViewFields10() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        linkBackToTop();
    }

    @Test(priority = 11)
    public void testHorizonPage11() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        horizonpage();
    }

    @Test(priority = 12)
    public void testProviderNetwork12() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        providerNetwork();
    }

    @Test(priority = 13)
    public void testImageProviderNetwork13() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        imageInProviderNetwork();
    }

    @Test(priority = 14)
    public void testSearchProviderDirectory14() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchProviderDirectory();
    }

    @Test(priority = 15)
    public void testProviderSearch15() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        providerLocation();
    }
}
