package com.watch.watchcollection.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.watch.watchcollection.Entity.watches;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class watchController {

    // Get all watches
    @GetMapping("/watches")
    public List<watches> getAllWatches() {
        return null;
    }
}
