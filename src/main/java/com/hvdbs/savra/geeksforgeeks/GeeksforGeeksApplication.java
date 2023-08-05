package com.hvdbs.savra.geeksforgeeks;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.StatsGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeeksforGeeksApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeeksforGeeksApplication.class, args);

        StatsGenerator.generate();
    }

}
