package Factory;

import Holder.PropertyHolder;
import converters.SupportedBrowserConverter;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver() {
        return SupportedBrowserConverter.valueOfWebBrowser(
                        new PropertyHolder().readProperty("browser"))
                .getWebDriver();
    }
}