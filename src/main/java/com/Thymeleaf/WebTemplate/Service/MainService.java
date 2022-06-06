package com.Thymeleaf.WebTemplate.Service;

import com.Thymeleaf.WebTemplate.Model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;


@Service
public class MainService {

    public String showLoginForm(Model model){

        User user = new User();
        model.addAttribute("user", user);
        return "login_form";
    }

    public String loginSubmitForm(){
        return "login_success";
    }

    public String showSignUpForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "signup_form";
    }

    public String signUpSubmitForm(){
        return "signup_success";
    }


}
