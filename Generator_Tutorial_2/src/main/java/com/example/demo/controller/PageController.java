package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/generator")
	public String index(@RequestParam(value = "a", required = false, defaultValue = "0") String a, @RequestParam(value = "b", required = false, defaultValue = "0") String b , Model model) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);	
		String hasil = "hm";
		if (num2 == 0) {
			if (num1 == 0) {
				model.addAttribute("hasil",hasil);
			}else {
				for (int i = 1 ; i < num1 ; i++) {
					hasil += "m";
				}
				model.addAttribute("hasil",hasil);
			}
			
		}else {		
			if (num1 == 0) {
				for (int i = 1 ; i < num2 ; i++) {
					hasil += " hm";
				}
				model.addAttribute("hasil",hasil);
			}else {
				String temp = "";
				for(int i = 0 ; i <num2 ; i++ ) {
					temp += " hm";
					for(int j = 1 ; j < num1 ; j++) {
						temp += "m";
					}
				}
				model.addAttribute("hasil",temp.substring(1));
			}
		}
		model.addAttribute("a", num1); //mengirim a ke html
		model.addAttribute("b", num2); //mengirim b ke html
		return "generator";
	}
	
}
