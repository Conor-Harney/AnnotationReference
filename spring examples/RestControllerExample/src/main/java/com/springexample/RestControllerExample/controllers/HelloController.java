package com.springexample.RestControllerExample.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.RestControllerExample.bodies.TestBody;

//Most basic form of a rest controller

//annotate class as controller
@RestController
public class HelloController 
{
	//Will cover all methods unless overwritten
	@RequestMapping("/hello")
	public String getHelloWorld()
	{
		return "Hello World";
	}
	
	
	//sample post path
	@RequestMapping(value="/hello", method = RequestMethod.POST)
	public String postHelloWorld()
	{
		return "Post Hello World";
	}
	
	//Sample method serving multiple paths 
	@RequestMapping(value = {
	        "/hiworld",
	        "/hi/world",
	        "/*world"//will accept any amount of characters proceeding world 
	    })
	public String greetingsWorld()
	{
		return "Greetings World"; 
	}
	
	//request params, headers and input body:
	@RequestMapping(value = "/paramTest", headers = "Accept=application/json", method = RequestMethod.POST)
	public String testParams(
			@RequestParam(value = "myInputStr", required = true) String myInputStr,
			@RequestBody TestBody myBody
			)
	{ 
		return "tested queryParam: " + myInputStr + "; and body: " + myBody;
	}

}
