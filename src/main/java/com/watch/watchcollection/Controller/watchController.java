package com.watch.watchcollection.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class watchController {

    @RequestMapping("/test")
    public String rolex() {
        return ("I love Rolex and Patek Philippe");
    }
}
