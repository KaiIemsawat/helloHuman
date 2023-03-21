package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	@RequestMapping("/")
	public String human(
			@RequestParam(value="name", required=false) String humanName
			, @RequestParam(value="lastname", required=false) String lastname
			, @RequestParam(value="time", required=false) String time){
			
		int t = 0;
		String display = " ";
		if (time != null) {
			t = Integer.parseInt(time);
		}
			

		for (int i = 0; i < t; i++) {
			if(humanName == null && lastname == null) {
				display += "Hello Human ";
			}
			else if (humanName != null && lastname != null) {
				display += ("Hello " + humanName + " " + lastname + " ");
			}
			else if(humanName != null && lastname == null) {
				display += ("Hello " + humanName + " ");
			}
			else display += ("Hello " + lastname + " ");
		}

		return display.trim();


	}
	
}
