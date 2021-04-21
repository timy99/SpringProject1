package com.itDen.blog.controler;

import com.itDen.blog.models.Post;
import com.itDen.blog.models.User;
import com.itDen.blog.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")

    public String userMain(Model model) {

        return "index";

    }
}

