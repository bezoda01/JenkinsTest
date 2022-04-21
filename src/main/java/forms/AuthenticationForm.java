package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AuthenticationForm extends Form {

    private final IButton signIn = getElementFactory().getButton(By.xpath("//button[@class = 'FlatButton FlatButton--primary FlatButton--size-l FlatButton--wide VkIdForm__button VkIdForm__signInButton']"), "Login in button");

    public AuthenticationForm() {
        super(By.id("index_login"), "Authentication page");
    }

    public void clickToEntire() {
        signIn.click();
    }
}
