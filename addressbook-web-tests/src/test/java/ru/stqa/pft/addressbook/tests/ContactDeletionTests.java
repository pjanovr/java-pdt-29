package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().crateContact(new ContactData("test1", "test2", "test3", "Saint Petersburg", "11223344", "testemail@mail.ru"));
      app.getNavigationHelper().returnToHomePage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initDeleteContact();
    app.getContactHelper().confirmContactDeletion();
    app.getNavigationHelper().goToHomePage();
  }
}
