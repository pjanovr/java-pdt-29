package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    initContactCreation();
    fillContactForm(new ContactData("fmane", "mname", "lname", "11223344", "testemail@mail.ru"));
    submitContactCreation();
    returnToHomePage();
  }
}
