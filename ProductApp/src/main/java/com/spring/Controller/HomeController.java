package com.spring.Controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.Entity.Details;
import com.spring.Entity.Product;
import com.spring.Services.ProductAddService;
import com.spring.Services.ProductDeleteService;
import com.spring.Services.ProductLoadAllService;

@Controller
@RequestMapping("product")
public class HomeController {
	
	@Autowired
	@Qualifier("productAddService")
	private ProductAddService productAddService;
	
	@Autowired
	@Qualifier("productDeleteService")
	private ProductDeleteService productDeleteService;
	
//	
//   private ProductUpdateService productUpdateService;
	
	
	@Autowired
	@Qualifier("productLoadAllService")
	private ProductLoadAllService productLoadAllService;
	
	
	
	@RequestMapping("home")
	public String showHome(Model m) {
		System.out.println("Inside /home handler" );
		List<Product> products = this.productLoadAllService.executeLoadAll();
		m.addAttribute("products",products);
		System.out.println(products);
		return "home";
	}
	
	@RequestMapping("add")
	public String addProduct(@ModelAttribute Product product, @RequestParam("avilabilityStatus") String status, Model m) {
		
		
		Details detail= new Details();
		LocalDateTime now = (LocalDateTime) LocalDateTime.now();
		detail.setDateadded(now);
		detail.setAvilability(status);
		product.setDetails(detail);

		String msg = this.productAddService.executeSave(product);
		m.addAttribute("msg",msg);
		
		RedirectView rv = new RedirectView();
		rv.setUrl("");
		
		return "redirect:home";
	}
	
	@RequestMapping(path = "delete/{id}", method = RequestMethod.POST)
	public String deleteProduct(@PathVariable("id") int id, Model m){
		
		
//		System.out.println(idString);
//		int id= Integer.parseInt(idString);
		System.out.println(id+1);
		this.productDeleteService.executeDelete(id);
		String executeDelete = "Deleted Successfully";
		m.addAttribute("msg",executeDelete);
		return "redirect:/product/home";
	}

}
