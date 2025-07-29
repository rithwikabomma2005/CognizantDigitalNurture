package com.rithwika;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        logger.warn("This is a warning message.");
        logger.error("This is an error message.");

        logger.info("Application ended.");
    }
}
