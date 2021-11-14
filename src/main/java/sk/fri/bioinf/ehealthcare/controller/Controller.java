package sk.fri.bioinf.ehealthcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String test() {

        return "Ahoj Svete";
    }
}
