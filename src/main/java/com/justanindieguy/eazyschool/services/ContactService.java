package com.justanindieguy.eazyschool.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.justanindieguy.eazyschool.models.Contact;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequestScope
public class ContactService {

    private int counter = 0;

    public ContactService() {
        System.out.println("ContactService Bean initialized.");
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

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
