package forms;

import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EntireForm extends Form {

    private final ITextBox usernameField = getElementFactory().getTextBox(By.name("login"), "Username field");
    private final ITextBox passwordField = getElementFactory().getTextBox(By.name("password"), "Password field");

    public EntireForm() {
        super(By.name("login"), "Entire page");
    }

    public void enterAndLogin(String username, String password) {
        usernameField.sendKeys(username);
        usernameField.sendKeys(Keys.ENTER);
        passwordField.sendKeys(password);
        passwordField.sendKeys(Keys.ENTER);
    }
}
