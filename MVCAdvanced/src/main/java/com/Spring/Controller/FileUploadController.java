package com.Spring.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/fileupload")
public class FileUploadController {

	
	@RequestMapping(path= "/upload/{id}"   ) 
//	example of @pathvarriable annotation to bind URI path Varriables to handler methods parameters
	public String showUploadForm(@PathVariable("id") int id)
	{
		System.out.println(id);
		String str= null;
		System.out.println( str.charAt(0));
		return "fileupload";
	}
	
	
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public String SaveImage(@RequestParam(value= "profile") CommonsMultipartFile file, HttpSession s, Model m) throws IOException {
		
		//Getting image in the for of Multipart file to save it to Byte[]
		byte[] data = file.getBytes();
		//we have to save the file to server
		//Getting the session.servletContext.getRealPath("/") returns root path of "MVCAdvanced" app
		String realPath = s.getServletContext().getRealPath("/")+"WEB-INF"+ File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(realPath);//Realpath shows the Path of the image on the deployed directory
		FileOutputStream fo =  new FileOutputStream(realPath);
		//FileoutStrem outputs the Byte data in file output form
		fo.write(data);
		fo.close();
		System.out.println("Pic uploaded");
		m.addAttribute("msg","Image Uploaded");
		m.addAttribute("filename",file.getOriginalFilename());
		return "success";
	}
}
