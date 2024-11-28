package com.zw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OuterController {
    @GetMapping("/out")
    public String outMethod(){
        return "outer";
    }
}
