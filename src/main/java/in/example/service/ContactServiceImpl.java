package in.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.example.Repository.ContactRepository;
import in.example.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
    private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		
		if(null == contact.getContactId()) {
			
			contact = contactRepository.save(contact);
			
		}else {
			
			contact = contactRepository.saveAndFlush(contact);
						
		}
		
		if(null != contact && null != contact.getContactId())
			 return true;
		
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		
		return contactRepository.findAll();
		
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		
	 Optional<Contact> opt = contactRepository.findById(contactId);
		
		if(null != opt && opt.isPresent()) {
			return (Contact) opt.get();
		}
		
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		
		contactRepository.deleteById(contactId);
		 Optional<Contact> opt = contactRepository.findById(contactId);
			
			if(null != opt && opt.isPresent()) {
				return false;
			}
		
		return true;
	}

}
