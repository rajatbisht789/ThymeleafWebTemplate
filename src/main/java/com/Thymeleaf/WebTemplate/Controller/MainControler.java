package com.Thymeleaf.WebTemplate.Controller;

import com.Thymeleaf.WebTemplate.Model.User;
import com.Thymeleaf.WebTemplate.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainControler{

    @Autowired
    MainService mainService;

    MainService obj1 = new MainService();

    @GetMapping("/login")
    public String showLoginForm(Model model){
        return this.mainService.showLoginForm(model);
    }

    @PostMapping("/login")
    public String loginSubmitForm(@ModelAttribute("user") User user){
        return this.mainService.loginSubmitForm();
    }

    @GetMapping("/signUp")
    public String showSignUpForm(Model model){
        return this.mainService.showSignUpForm(model);
    }

    @PostMapping("/signUp")
    public String signUpSubmitForm(@ModelAttribute("user") User user){
        return this.mainService.signUpSubmitForm();
    }


}
