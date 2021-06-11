package com.aritra.cowinapp;

import com.aritra.cowinapp.service.CowinVaccinationSlotService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CowinSlotBookingApplication {

    static CowinVaccinationSlotService service = new CowinVaccinationSlotService();

    public static void main(String[] args) {
        SpringApplication.run(CowinSlotBookingApplication.class, args);
    }

}
