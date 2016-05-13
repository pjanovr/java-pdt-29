package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by roman.pianov on 19.04.2016.
 */
public class ContactDeletionTests extends TestBase {

  @BeforeMethod
  public void insurePrecondition() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withFirstName("test1").withMiddleName("test2").withLastName("test3")
              .withAddress("Saint Petersburg").withHomephone("111111111").withEmail("testmail@mail.ru"));
      app.goTo().returnToHomePage();
    }
  }

  @Test
  public void testContactDeletion() {
    Contacts before = app.contact().all();
    ContactData deletedContact = before.iterator().next();
    app.contact().delete(deletedContact);
    app.goTo().homePage();
    Contacts after = app.contact().all();

    assertThat(after.size(), equalTo(before.size() - 1));
    assertThat(after, equalTo(before.without(deletedContact)));
  }
}

