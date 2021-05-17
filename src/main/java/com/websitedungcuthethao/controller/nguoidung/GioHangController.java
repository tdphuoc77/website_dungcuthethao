package com.websitedungcuthethao.controller.nguoidung;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GioHangController {
	@GetMapping("gio-hang")
	public String index (Model model) {
		
		return "nguoidung/giohang";
	}
	
	@GetMapping("thanh-toan")
	public String thanhtoan (Model model) {
		
		return "nguoidung/thanhtoan";
	}
}
