package com.opf.project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class RESTController {
    /**
     * It gets the details of the project
     * + Developer's registered email address
     * + The current datetime
     * + The GitHub URL of the project
     * @return details
     */
    @GetMapping("/")
    public Map<String, String> getProjectDetails() {
        // A record to hold the details
        Map<String, String> details = new HashMap<>();

        // put "Your registered email" into the record
        details.put("email", "folaranmifisayo@gmail.com");

        // put "The current datetime" into the record
        String dateTime = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        details.put("current_datetime", dateTime);

        // put "The GitHub url" into the record
        details.put("github_url", "https://github.com/Oluwafisayomi-P-Folaranmi/hngx-stage0-project-details.git");

        return details;
    }
}
