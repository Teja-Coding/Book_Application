package com.web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.Binding.BookClass;
@Controller
public class BookController {
	@GetMapping("/bookDetails")
	public ModelAndView bookDetails() {
		ModelAndView mv=new ModelAndView();
		BookClass b1=new BookClass(101, "java", 500.0);
		mv.addObject("book",b1);
		mv.setViewName("bookDetails");
		return mv;
	}
	@GetMapping("/allBooks")
	public ModelAndView allBookDetails() {
		ModelAndView mv=new ModelAndView();
		BookClass b1=new BookClass(101, "java", 500.0);
		BookClass b2=new BookClass(102, "Python", 565.0);
		BookClass b3=new BookClass(103, "Dotnet", 595.0);
		
		List<BookClass> asList = Arrays.asList(b1,b2,b3);
		mv.addObject("allBookDetails", asList);
		mv.setViewName("allBookDetails");
		
		
		return mv;
	}
	

}
