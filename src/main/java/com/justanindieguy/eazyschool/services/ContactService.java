package com.justanindieguy.eazyschool.services;

import org.springframework.stereotype.Service;

import com.justanindieguy.eazyschool.models.Contact;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactService {

    /**
     * Save contact details into DB
     *
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;

        // TODO - Need to persists the table into the DB table.
        log.info(contact.toString());

        return isSaved;
    }

}
