package com.practice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.services.ProductService;

//import com.boot.entity.Users;
//import com.boot.service.ContactService;
//import com.boot.service.UserService;

//import com.boot.entity.Users;
@Controller
public class HomeController {

	@Autowired
	private ProductService productservice;
//
//	@Autowired
//	private ContactService contactDao;

	@RequestMapping("/")
	public String index(Model model,HttpServletRequest request) {
		
    	model.addAttribute("products",productservice.findAll());
//		
//		System.out.println(model);
		
		return "index";
	}
	@GetMapping("/index")
	public String getHomePage(Model model, HttpServletRequest request) {
	//	HttpSession session = request.getSession();
	//	Users user = (Users) session.getAttribute("currentUser");
/*		if (user == null)
			return "redirect:/";
		else {
		//	model.addAttribute("contacts", contactDao.getUserContacts(user));
		}*/
		return "home";
	}

}
