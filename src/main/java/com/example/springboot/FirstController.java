package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "group", required = false) String group)   {
        System.out.println("Студент, " + name);
        System.out.println("Группа, " + group);
        return "Студент: Клейменов Группы: АУБПз-22у";
    }
}
