package forms;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class NewsForm extends Form {

    public NewsForm() {
        super(By.id("post_field"), "News page");
    }
}
