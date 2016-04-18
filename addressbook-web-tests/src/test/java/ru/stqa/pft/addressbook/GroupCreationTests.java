package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGropPage();
    initGropCreation();
    fillGroupFrom(new GropData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
