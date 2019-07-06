package com.openshift.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftController {
    public String defaultCall(){
        return "Hello Kumar, welcome to OpenShift";
    }
}
