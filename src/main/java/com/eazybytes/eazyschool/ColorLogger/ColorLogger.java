package com.eazybytes.eazyschool.ColorLogger;

import org.springframework.stereotype.Component;

import com.eazybytes.eazyschool.rest.AdminControllerr;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ColorLogger {
    
    public void logDebug(String logging) {
        log.debug("\u001B[34m" + logging + "\u001B[0m");
    }
    public void logInfo(String logging) {
        log.info("\u001B[32m" + logging + "\u001B[0m");
    }
    
    public void logError(String logging) {
        log.error("\u001B[31m" + logging + "\u001B[0m");
    }
}