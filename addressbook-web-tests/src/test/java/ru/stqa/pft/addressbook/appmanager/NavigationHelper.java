package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class NavigationHelper extends HelperBase {
  private WebDriver wd;

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGropPage() {
    click(By.linkText("groups"));
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }
  public void goToHomePage(){
    click(By.linkText("home"));
  }
}
