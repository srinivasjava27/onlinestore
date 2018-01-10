package net.srb.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.srb.shoopingbackend.dao.CategoryDAO;
import net.srb.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");

		// passing the lsit of categories
		mv.addObject("categories", categoryDAO.list());

		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);

		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);

		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);

		return mv;
	}

	// method to load all the methods based on the category.

	@RequestMapping(value = { "show/all/products" })
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");

		// passing the lsit of categories
		mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickAllProducts", true);

		return mv;
	}
	
	
	@RequestMapping(value = { "show/all/{id}/products" })
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		//category dao to fetch a single ategory
		Category category=null;
		
		category=categoryDAO.get(id);
		
		mv.addObject("title", category.getName());

		// passing the lsit of categories
		mv.addObject("categories", categoryDAO.list());
		
		//passing single category object
		mv.addObject("category", category);

		mv.addObject("userClickCategoryProducts", true);

		return mv;
	}

	// @RequestMapping(value= {"/test"})
	// public ModelAndView test(@RequestParam("greeting") String greeting) {
	// ModelAndView mv=new ModelAndView("page");
	//
	// mv.addObject("greeting",greeting);
	//
	// return mv;
	// }

	// @RequestMapping(value= "/test/{greeting}")
	// public ModelAndView test(@PathVariable("greeting") String greeting) {
	// if(greeting==null) {
	// greeting="hello world";
	// }
	// ModelAndView mv=new ModelAndView("page");
	// mv.addObject("greeting",greeting);
	//
	// return mv;
	// }

}
