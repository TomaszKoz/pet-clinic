package com.archicode.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tomasz Kozlowski (created on 03.10.2018)
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
