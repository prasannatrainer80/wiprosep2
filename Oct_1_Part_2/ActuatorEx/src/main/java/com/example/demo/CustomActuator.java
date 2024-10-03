package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
@Component
@Endpoint(id="change-logs")
public class CustomActuator {
    String changelog = "** version 2.0 ** \n\n"
            + "* Improved performance \n"
            + "* removed bug fix with local-id \n"
            + "* Added support of SAML authentication \n";
    @ReadOperation
    public String changeLogs() {
        return changelog;
    }
}