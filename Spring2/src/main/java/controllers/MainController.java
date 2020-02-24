package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.ProductService;

@Controller
public class MainController {

    @GetMapping({"/", "/welcome"})
    public String welcome(){
        return "welcome";
    }
}
