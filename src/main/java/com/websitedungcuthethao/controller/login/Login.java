package com.websitedungcuthethao.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Login {
	@RequestMapping("/dang-nhap")
	public String dangnhap() {
		return "login/login";
	}

}
