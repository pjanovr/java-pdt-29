package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initDeleteContact();
    app.getContactHelper().confirmContactDeletion();
    app.getNavigationHelper().goToHomePage();
  }
}
