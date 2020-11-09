package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	 @Value(value = "${message}")
	 private String msg;
	 
   @RequestMapping("/")
   public String check()
   {
	return msg;
	   
   }
}
