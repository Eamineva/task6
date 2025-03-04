package web.controller;

import dservice.UserService;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {
	@Autowired
	//@Qualifier("web")
//    private UserDao userDao;
	private UserService userService;
	@RequestMapping("/")
	public String ShowUser(Model model){
//        List<User> allUsers = userDao.listUsers();
		List<User> allUsers = userService.listUsers();
		model.addAttribute("allUs",allUsers);

		return "index";
	}
}