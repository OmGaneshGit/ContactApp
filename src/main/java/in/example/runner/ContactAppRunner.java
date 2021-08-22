package in.example.runner;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.example.entity.Contact;
import in.example.service.ContactService;



@Component
public class ContactAppRunner implements CommandLineRunner {
	
	@Autowired
	ContactService contactService;
	
	@Override
	public void run(String... args) throws Exception {
		
		
				
		//save
		Contact cnt = new Contact(null, "Ashwin", "ashwin@xyz.com", new Long(1122334455), 'A',  LocalDate.now(), null);
		
		boolean isSaved = contactService.saveContact(cnt);
		System.out.println("Contact is saved status "+ isSaved+ " cntId = "+cnt.getContactId()+" emailId = "+ cnt.getContactEmail());
		System.out.println("******************************");
		
        Contact cntt = new Contact(null, "Suresh", "suresh@abc.com", new Long(1213321235), 'A',  LocalDate.now(), null);
		
		isSaved = contactService.saveContact(cntt);
		System.out.println("Contact is saved status "+ isSaved+ " cntId = "+cntt.getContactId()+" emailId = "+ cntt.getContactEmail());
		System.out.println("******************************");
		
		
		//findById
		Contact  cnt1 = contactService.getContactById(cnt.getContactId());
		System.out.println(cnt1);
		System.out.println("**************************");
		
		//findAll
		List<Contact>  cntList = contactService.getAllContacts();
		cntList.forEach(cnts -> System.out.println(cnts));
		System.out.println("***************************************");
		
		//saveAndFlush(update)
		Contact  cnt2 = contactService.getContactById(cnt1.getContactId());
		
		cnt2.setContactEmail("ashwin@xyz.in");
		cnt2.setUpdatedDate(LocalDate.now());
		isSaved = contactService.saveContact(cnt2);
		System.out.println("Contact is update status "+ isSaved+ " cntId = "+cnt2.getContactId()+" emailId = "+ cnt2.getContactEmail()+" updatedDate = "+cnt2.getUpdatedDate());
		System.out.println("***************************");
		
		//deleteById
		boolean isDeleted = contactService.deleteContactById(cnt.getContactId());
		System.out.println("Contact delete status = "+ isDeleted);
		
		Contact  cnt3 = contactService.getContactById(cnt.getContactId());
		System.out.println(cnt3);
		System.out.println("**************************");
		
		//findAll
		cntList = contactService.getAllContacts();
		cntList.forEach(cnts -> System.out.println(cnts));
		System.out.println("***************************************");
		
	}

}
