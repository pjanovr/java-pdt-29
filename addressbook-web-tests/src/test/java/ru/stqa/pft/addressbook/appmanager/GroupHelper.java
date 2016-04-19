package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GropData;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class GroupHelper extends  HelperBase {

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupFrom(GropData gropData) {
    type(By.name("group_name"), gropData.getName());
    type(By.name("group_header"), gropData.getHeader());
    type(By.name("group_footer"), gropData.getFooter());
  }

  public void initGropCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
