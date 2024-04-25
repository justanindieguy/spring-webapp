package com.justanindieguy.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private static final Logger log = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMsg(@RequestParam String name, @RequestParam String mobileNum,
            @RequestParam String email, @RequestParam String subject,
            @RequestParam String message) {

        log.info("Name: " + name);
        log.info("Mobile number: " + mobileNum);
        log.info("Email address: " + email);
        log.info("Subject: " + subject);
        log.info("Message: " + message);

        return new ModelAndView("redirect:/contact");
    }

}
