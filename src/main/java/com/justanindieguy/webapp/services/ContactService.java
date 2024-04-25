package com.justanindieguy.webapp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.justanindieguy.webapp.models.Contact;

@Service
public class ContactService {

    private static final Logger log = LoggerFactory.getLogger(ContactService.class);

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
