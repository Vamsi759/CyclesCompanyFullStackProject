package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UiPages {

	@RequestMapping("/open")
	public String open() {
		return "Dashboard";
	}
	
	@RequestMapping("/openAdmin")
	public String openAdmin() {
		return "Admin";
	}
	@RequestMapping("/openSalesHome")
	public String openSalesHome() {
		return "SalesHome";
	}
	
//	public String openedit(){
//		return "edit";
//	}
//	
	
	
	
}
