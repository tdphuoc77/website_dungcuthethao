package com.websitedungcuthethao.controller.dangnhap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dang-nhap")
public class DangNhap {

	@GetMapping
	public String index() {
		return "dangnhap/dangnhap";
	}

}
