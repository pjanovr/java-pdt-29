package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void groupPage() {
    if (isElementPresent(By.tagName("h1"))  && wd.findElement(By.tagName("h1")).getText().equals("Groups") && isElementPresent(By.name("new"))){
      return;
    }
      click(By.linkText("groups"));
  }

  public void returnToHomePage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("home page"));
  }

  public void goToHomePage(){
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("home"));
  }
}
