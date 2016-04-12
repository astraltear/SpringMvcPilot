package com.astraltear.springpilot.controller;

import java.net.URLDecoder;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@PropertySource("classpath:database.properties")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
/*	@Value("${database.type}")
	private Object runType; 
	
	@Value("${database.master.driverClassName}")
	private String className;
	
	@Value("${database.master.url}")
	private String runUrl;*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.", locale);
//		logger.debug("runType :{}",runType);
//		logger.debug("className:{}",className);
//		logger.debug("runUrl :{}",runUrl);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer inPropertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
