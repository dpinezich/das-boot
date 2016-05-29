package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;
/**
 * Created by david_000 on 29.05.2016.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return ShipwreckStub.list();
    }
}
