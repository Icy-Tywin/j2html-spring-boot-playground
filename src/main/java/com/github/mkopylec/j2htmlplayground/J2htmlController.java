package com.github.mkopylec.j2htmlplayground;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class J2htmlController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        return null;
    }
}
