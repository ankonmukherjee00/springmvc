
package com.ankon;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddController 
{
	
	
	@RequestMapping("/add")
	public String add()
	{
		
		return "display.jsp";
		
	}

}
