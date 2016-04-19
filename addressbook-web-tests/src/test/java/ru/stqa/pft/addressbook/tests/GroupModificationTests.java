package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GropData;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGropPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupFrom(new GropData("qqq","www", "eee"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
