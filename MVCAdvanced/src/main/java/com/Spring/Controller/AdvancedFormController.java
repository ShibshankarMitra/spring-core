package com.Spring.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.Entity.User;
import com.Spring.Entity.UserDemo;
import com.Spring.Service.UserService;

@Controller
@RequestMapping("advancedform")
public class AdvancedFormController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//Handler to Show the Form
	@RequestMapping("home")
	public String ShowForm()
	{
		return "home";
	}
	
	
	//Handler to save the Form Input where <input type="date" name= "dateOfBirth"> needs to be auto binded. @Entity used is User.
	//Internally @requestParam "dateOfBirth"<input type = "date"> is consumed as Java.util.String.
	//So it Can-not be Auto-Binded by Name toJava.util.Date field "dateOfBirth" inside @Entity User.
	//Exception is- Failed to convert from type [java.lang.String] to type [java.util.Date] 
	//
	//to remediate this we use @DateTimeFormat(pattern = "yyyy-MM-dd") Annotation Over the Java.util.Date field "dateOfBirth" inside @Entity User.
	//then we use @Temporal(TemporalType.DATE/TIME/TIMESTAMP) to Map java.util.date to java.sql.date for Database Operation.
	@RequestMapping("saveform1")
	public String saveform(@ModelAttribute("user") User user, BindingResult result)//Bindresult helps to handle Form Auto-Binding exceptions
	{
		
		if (result.hasErrors())
		{
			System.out.println(result);
			return "home";
			
		}
		
		else
		{
			System.out.println(user);
			if(user.getChk()==null)
			{
				user.setChk("Off");
			}
			String executeSave = this.userService.executeSave(user);
//			m.addAttribute("result", executeSave);
			return "success";
		}
		
		
	}

	//Handler to show the internal workflow of Date Auto-binding/ Binded manually.
	//<"date"> type parameters Cannot be passed as (Java.util.date) @RequestParam variables.
	//we have to pass as (java.util.String) @RequestParam variables, then Manually parse to java.util.Date.
	//Then Calling Setter() to set java.util.Date object to the java.util.Date field UserDemo @entity. 
	
	//In this Demo Entity used is UserDemo, Used a Different Field name(private Date dob;) for java.util.Date field 
	//to break Auto-binding of @Requestparam "dateOfBirth".
	
	@RequestMapping("saveform2")
	public String saveformtest(@RequestParam("dateOfBirth") String date,@ModelAttribute("userDemo") UserDemo user,  Model m) throws ParseException
	{
		
		System.out.println("Getting Java.Util.Date Date from @RequestParam = "+date);
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
		System.out.println("After Parsing String date to Date date = "+date1);
		user.setDob(date1);
		System.out.println("After Setting up dob inside UserDemo @Entity.Now @Entity user.getDob() = "+user.getDob());
		if(user.getChk()==null)
		{
			user.setChk("off");
		}
		
		String executeSave = this.userService.executeSaveDemo(user);
		m.addAttribute("result", executeSave);
		return "success";
		
		
	}
	
	
	
	
}
