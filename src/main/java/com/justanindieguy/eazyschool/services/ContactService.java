package com.justanindieguy.eazyschool.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justanindieguy.eazyschool.constants.EazySchoolConstants;
import com.justanindieguy.eazyschool.models.Contact;
import com.justanindieguy.eazyschool.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    /**
     * Save contact details into DB
     *
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.OPEN);
        contact.setCreatedBy(EazySchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());

        int result = contactRepository.saveContactMsg(contact);

        if (result > 0) {
            isSaved = true;
        }

        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        List<Contact> contactMsgs = contactRepository.findMsgsWithStatus(EazySchoolConstants.OPEN);
        return contactMsgs;
    }

}
