package io.getarrays.contactapi.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// @RequestMapping({"/","/home"})
public class IndexController {

    @GetMapping({"/","/home"})
    public String index() {
        return "redirect:/index.html";
    }

}
