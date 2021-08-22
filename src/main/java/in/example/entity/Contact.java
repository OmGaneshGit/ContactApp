package in.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name="CONTACT_DTLS")
@Data

public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
	
	@Column(name="ACTIVE_SW")
	private Character activeSwitch;
	
	@Column(name="CREATED_DATE")
	private LocalDate createdDate;
	
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactNumber=" + contactNumber + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
	
	public Contact() {
	
	}

	public Contact(Integer contactId, String contactName, String contactEmail, Long contactNumber,
			Character activeSwitch, LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactNumber = contactNumber;
		this.activeSwitch = activeSwitch;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Character getActiveSwitch() {
		return activeSwitch;
	}

	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	

}
