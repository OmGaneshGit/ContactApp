package in.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.example.entity.Contact;

@Service
public interface ContactService {
	
	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public boolean deleteContactById(Integer contactId);

}
