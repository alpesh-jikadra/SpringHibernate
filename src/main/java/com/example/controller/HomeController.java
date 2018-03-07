package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.UserDAO;
import com.example.dto.User;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/")
	public ModelAndView home(){
		
		List<User> listAll = userDAO.listAll();
		ModelAndView mv=  new ModelAndView("home");
		mv.addObject("userList", listAll);
		return mv;
		
	}
	
	@RequestMapping(value="/listAll")
	public ModelAndView listAll(){
		List<User> listAll = userDAO.listAll();
		ModelAndView mv=  new ModelAndView("home");
		mv.addObject("userList", listAll);
		return mv;
		
	}
	
	@RequestMapping(value="/get")
	public ModelAndView get(){
		
		User user = userDAO.get();
		ModelAndView mv=  new ModelAndView("home");
		List<User> listAll = new ArrayList<>();
		listAll.add(user);
		mv.addObject("userList", listAll);
		return mv;
		
	}
	
	@RequestMapping(value="/listAndGet")
	public ModelAndView listAndGet(){
		
		List<User> listAll = userDAO.listAndGet();
		ModelAndView mv=  new ModelAndView("home");
		mv.addObject("userList", listAll);
		return mv;
		
	}
	
	@RequestMapping(value="/retrieveAllAndGet")
	public ModelAndView retrieveAllAndGet(){
		
		List<User> listAll = userDAO.listAll();
		User user = userDAO.get();
		listAll.add(user);
		ModelAndView mv=  new ModelAndView("home");
		mv.addObject("userList", listAll);
		return mv;
		
	}
	
}
