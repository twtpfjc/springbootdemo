package com.example.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.User;
import com.example.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String a(Model model) {
		System.out.println(11111);
		return "index";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println(1123);
		List<User> list = userService.findAllUser();
		model.addAttribute("list", list);
		return "index";
	}

	@GetMapping("/update")
	public String update(Integer id, Model model) {
		User user = userService.findUserById(id);
		model.addAttribute("user", user);
		return "update";
	}

	@GetMapping("/add")
	public String update() {
		return "update";
	}

	@PostMapping("/update")
	public String update(User user) {
		if (user != null) {
			if (user.getId() != null && !user.getId().equals("")) {
				userService.updateUser(user);
			} else {
				userService.addUser(user);
			}
		}
		return "redirect:/list";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Map delete(Integer id, Model model) {
		userService.delete(id);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("data", true);
		return map;
	}

}
