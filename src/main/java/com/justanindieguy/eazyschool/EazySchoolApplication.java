package com.justanindieguy.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }) <- Don't auto-configure this classes
 * it is developer responsibility to create the Bean for this class/classes
 */

@SpringBootApplication
public class EazySchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(EazySchoolApplication.class, args);
    }

}
