package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().crateContact(new ContactData("test1", "test2", "test3", "Saint Petersburg", "11223344", "testemail@mail.ru"));
    app.getNavigationHelper().returnToHomePage();
  }
}
