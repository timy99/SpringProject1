package com.itDen.blog.controler;

import com.itDen.blog.models.Post;
import com.itDen.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainControler {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        Iterable<Post> posts = postRepository.findAll();//вытянет все записи из табицы пост
        //передаем все записи в шаблон
        model.addAttribute("posts", posts);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title","Страница про нас");
                return "about";
    }

}