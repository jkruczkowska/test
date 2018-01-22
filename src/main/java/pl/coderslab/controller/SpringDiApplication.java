package pl.coderslab.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class SpringDiApplication {

//	public static void main(String[] args) {
//	
//
//	}
	
	@RequestMapping("/")
	@ResponseBody
	public String mainRoute(Model model, HttpSession ses) {
	        return "hello";
	}

}