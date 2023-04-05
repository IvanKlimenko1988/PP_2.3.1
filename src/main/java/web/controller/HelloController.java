package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String gethelloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String getgoodByePage() {
        return "first/goodbye";
    }
}
