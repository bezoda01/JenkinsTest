package utils;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoAlertPresentException;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Set;

public class BrowserUtils {

    public static Browser getBrowser() {
        return AqualityServices.getBrowser();
    }

    public static boolean isBrowserStarted() {
        return AqualityServices.isBrowserStarted();
    }

    public static void maximize() {
        getBrowser().maximize();
    }

    public static void quit() {
        if (isBrowserStarted()) {
            getBrowser().quit();
        }
    }

    public static void addCookie(String name, String value) {
        AqualityServices.getBrowser().getDriver().manage().addCookie(new Cookie(name, value));
    }

    public static void refresh() {
        getBrowser().refresh();
    }

    public static void goBack() {
        getBrowser().goBack();
    }

    public static void goTo(String url) {
        getBrowser().goTo(url);
    }

    public static Set<String> getTabHandles() {
       return getBrowser().tabs().getTabHandles();
    }

    public static void switchToTab(String window) {
        getBrowser().tabs().switchToTab(window);
    }

    public static void closeCurrentTab(){
        getBrowser().tabs().closeTab();
    }

    public static String handlePromptAlert(AlertActions alertAction) {
        String alertText;
        try {
            Alert alert = getBrowser().getDriver().switchTo().alert();
            alertText = alert.getText();
            if (alertAction.equals(AlertActions.ACCEPT)) {
                alert.accept();
            } else {
                alert.dismiss();
            }
        } catch (NoAlertPresentException exception) {
            exception.printStackTrace();
            throw exception;
        }
        return alertText;
    }

    public static void executeClosePopUp() {
        AqualityServices.getBrowser().executeScript("closePopUp()", "0");
    }

    public static String getSessionId() {
        return String.valueOf(AqualityServices.getBrowser().getDriver().getSessionId());
    }

    public static String getHostName() {
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return addr.getHostName();
    }

}
