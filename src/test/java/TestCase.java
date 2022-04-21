import aquality.selenium.browser.AqualityServices;
import config.JsonEnvironment;
import forms.AuthenticationForm;
import forms.EntireForm;
import forms.NewsForm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {
    public static aquality.selenium.core.logging.Logger getLogger() {
        return AqualityServices.getLogger();
    }

    @Test
    public void test() {
        getLogger().info("Open authentication page");
        AuthenticationForm authenticationForm = new AuthenticationForm();
        Assert.assertTrue(authenticationForm.state().waitForDisplayed(), "Page was not open");
        authenticationForm.clickToEntire();
        getLogger().info("Open entire page");
        EntireForm entireForm = new EntireForm();
        entireForm.enterAndLogin(JsonEnvironment.environment.getValue("/login").toString(), JsonEnvironment.environment.getValue("/password").toString());
        getLogger().info("Open news page");
        NewsForm newsForm = new NewsForm();
        Assert.assertTrue(newsForm.state().waitForDisplayed(), "Page was not open");
    }
}
