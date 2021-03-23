package com.example.springlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("Hello from debug");
        logger.info("Hello from info");
        logger.error("Hello from error");
        System.out.println("Hello");
    }
}
