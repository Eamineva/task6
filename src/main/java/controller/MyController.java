package controller;

import dservice.UserService;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired

    private UserService userService;
    @RequestMapping("/")
    public String ShowUser(Model model){
        List<User> allUsers = userService.listUsers();
        model.addAttribute("allUs",allUsers);

        return "index";
    }
}
