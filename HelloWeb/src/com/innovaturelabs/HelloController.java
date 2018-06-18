package com.innovaturelabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.apache.log4j.Logger;

@Controller
@RequestMapping("/hello")
public class HelloController {
	static Logger log = Logger.getLogger(HelloController.class.getName());
	
   @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) { 
	  log.info("Going to create HelloWord Obj");
      model.addAttribute("message", "----Hello Spring MVC Framework!----");
      return "hello";
   }
}
