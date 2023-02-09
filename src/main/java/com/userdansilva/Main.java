package com.userdansilva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/welcome")
    public WelcomeResponse welcome() {
//        return new WelcomeResponse("This is fine");
        return new WelcomeResponse("This is not fine", "bye bye");
    }

    record WelcomeResponse(String welcome, String goodbye) {}

//    static class WelcomeResponse {
//        final String welcome;
//        final String goodbye;
//
//        public WelcomeResponse(String welcome, String goodbye) {
//            this.welcome = welcome;
//            this.goodbye = goodbye;
//        }
//
//        public String incrementWelcome() {
//            return getWelcome() + ", or it is!";
//        }
//
//        public String getWelcome() {
//            return welcome;
//        }
//
//        public String getGoodbye() {
//            return goodbye;
//        }
//    }
}
