package com.openshift.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftController {

    @RequestMapping("/")
    public String defaultCall(){
        return "Hello Kumar, welcome to OpenShift";
    }
}
