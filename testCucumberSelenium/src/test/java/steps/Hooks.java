package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void initData() {
        WebDriverUtil.initializeWebDriver();
    }

    @After
    public void clearData() {
        WebDriverUtil.WEB_DRIVER.quit();
        WebDriverUtil.WEB_DRIVER = null;
    }
}
