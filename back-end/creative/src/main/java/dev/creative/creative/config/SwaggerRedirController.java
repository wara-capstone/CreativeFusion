package dev.creative.creative.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api-docs")
public class SwaggerRedirController {

        @GetMapping
        public String api() { return "redirect:/swagger-ui/index.html"; }

}
