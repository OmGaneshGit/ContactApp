package in.example.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable> {
	
	

}
