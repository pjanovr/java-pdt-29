package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  private void insurePrecondition() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withFirstName("test1").withMiddleName("test2").withLastName("test3")
              .withAddress("Saint Petersburg").withHomephone("111111111").withEmail("testmail@mail.ru"));
      app.goTo().returnToHomePage();
    }
  }

  @Test
  public void testModificationContact() {

    Contacts before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContact.getId()).withFirstName("test1_modify")
            .withMiddleName("test2_modify").withLastName("test3_modify").withAddress("Saint Petersburg_modify")
            .withHomephone("0999999").withEmail("testemail_modify@mail.ru");
    app.contact().modify(contact);
    app.goTo().returnToHomePage();

    assertEquals(app.contact().count(), before.size());
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
  }




}
