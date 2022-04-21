import config.JsonEnvironment;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;

public abstract class BaseTest {

    @BeforeMethod
    protected void beforeMethod() {
        BrowserUtils.goTo(JsonEnvironment.environment.getValue("/url").toString());
        BrowserUtils.maximize();
    }

    @AfterMethod
    public void afterTest() {
        BrowserUtils.quit();
    }
}
