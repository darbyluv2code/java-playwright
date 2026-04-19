package org.luv2code.o7_real_time_challanges;

import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;
import org.luv2code.framework.base.BaseTest;

public class DynamicLocatorTest extends BaseTest {
    @Test
    public void dynamicLocatorTest() {

        // navigate to 'dynamic elements' page
        page.navigate("https://www.luv2test.com/#/dynamic-elements");

        // locate dynamic id button
//        Locator dynamicIdButton = page.locator("#btn_9uriakte");
        Locator dynamicIdButton = page.locator("//button[contains(@id,'btn_')]");
        highlightElement(dynamicIdButton);
        dynamicIdButton.click();

        // verify dynamic content
        Locator dynamicContent = page.locator("//div[contains(text(),'Dynamic button clicked successfully!')]");
        System.out.println("Dynamic button clicked: " + dynamicContent.isHidden());

    }
}
