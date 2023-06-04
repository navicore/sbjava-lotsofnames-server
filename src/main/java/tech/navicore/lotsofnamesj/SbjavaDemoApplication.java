package tech.navicore.lotsofnamesj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbjavaDemoApplication {
    private static final Logger log = LoggerFactory.getLogger(SbjavaDemoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SbjavaDemoApplication.class, args);

    }

}
