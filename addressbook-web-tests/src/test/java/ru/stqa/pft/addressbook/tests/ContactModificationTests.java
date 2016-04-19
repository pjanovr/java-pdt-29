package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class ContactModificationTests extends TestBase {
  @Test
  public void testModificationContact() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().initModifyContact();
    app.getContactHelper().fillContactForm(new ContactData("test1_modify", "test2_modify", "test3_modify", "Saint Petersburg_modify", "0999999", "testemail_modify@mail.ru"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
  }
}
