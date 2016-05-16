package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Arrays;
import java.util.stream.Collectors;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by roman.pianov on 16.05.2016.
 */
public class ContactFullInfoTest extends TestBase {
  @Test
  public void testContactFullInfo() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
    ContactData contactInfoFromViewPage = app.contact().infoFromViewPage(contact);
    ContactData mergedInfoFromEditFrom = new ContactData().withId(contact.getId()).
            withFullInfo(mergeNames(contactInfoFromEditForm) + " " +
                    contactInfoFromEditForm.getAddress() + " " +
                    mergePhones(contactInfoFromEditForm) + " " +
                    mergeEmails(contactInfoFromEditForm));

    assertThat(cleanDetailedInfo(contactInfoFromViewPage.getFullInfo()), equalTo(mergedInfoFromEditFrom.getFullInfo()));
  }

  private String mergeNames(ContactData contactInfoFromEditForm) {
    return Arrays.asList(contactInfoFromEditForm.getFirstname(), contactInfoFromEditForm.getMiddlename(),
            contactInfoFromEditForm.getLastname()).stream().filter((s) -> !s.equals(""))
            .collect(Collectors.joining(" "));
  }

  private String mergeEmails(ContactData contactInfoFromEditForm) {
    return Arrays.asList(contactInfoFromEditForm.getEmail(), contactInfoFromEditForm.getEmail2(),
            contactInfoFromEditForm.getEmail3()).stream().filter((s) -> !s.equals(""))
            .map(ContactFullInfoTest::cleanDetailedInfo).collect(Collectors.joining(" "));
  }

  private String mergePhones(ContactData contactInfoFromEditForm) {
    return Arrays.asList(contactInfoFromEditForm.getHomePhone(), contactInfoFromEditForm.getMobilePhone(), contactInfoFromEditForm.getWorkPhone())
            .stream().filter((s) -> !s.equals("")).map(ContactFullInfoTest::cleanDetailedInfo)
            .collect(Collectors.joining(" "));
  }

  private static String cleanDetailedInfo(String contactInfo) {
    return contactInfo.replaceAll("(H: |M: |W: )|( \\(www.*\\))", " ")
            .replaceAll("(\\s+)", " ").trim();
  }
}