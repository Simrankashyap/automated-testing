/*
 * @author Anjali
 * @since 2016-06-13
 * This class performs log in as an existing user to carry out other functions that requires login.
 * It serves as a prerequisite for validating other functions after successful login.
 */
package LoginAndRegistration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.constants;
import PageObjectModel.logoutPageElements;
import WebDriver.driver;

public class existingUserLogin 
{
	public static void login()
	{
		driver.Instance.get(constants.baseURL+"login.php");
		loginPage.loginAs(constants.existingEmailId)
		.withPassword(constants.existingPassword)
		.login();
		WebDriverWait wait = new WebDriverWait(driver.Instance, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(logoutPageElements.logoutButton()));
	}
}
