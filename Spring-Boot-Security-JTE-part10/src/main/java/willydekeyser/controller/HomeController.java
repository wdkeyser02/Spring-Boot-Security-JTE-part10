package willydekeyser.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import willydekeyser.config.CustomUser;

@Controller
public class HomeController {
	
    @GetMapping("/")
    public String home(Authentication authentication) {
        return "index";
    }

    @GetMapping("/public")
    public String public_page(Authentication authentication) {
        return "public";
    }

    @GetMapping("/user")
    public String private_page_user(@AuthenticationPrincipal CustomUser user) {
        return "user";
    }

    @GetMapping("/admin")
    public String private_page_admin(@AuthenticationPrincipal CustomUser user) {
        return "admin";
    }
}