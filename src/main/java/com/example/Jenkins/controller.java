package com.example.Jenkins;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    public String jenkins()
    {
        System.out.println("freestyle jenkins CI CD check");
        return "hello jenkins check";
    }
}
