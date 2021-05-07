package com.websitedungcuthethao.controller.quantri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quan-tri")
public class TrangChu_QuanTri {
	@GetMapping("/trang-chu")
	public ModelAndView trangchu() {
		return new ModelAndView("quantri/trangchu");
	}
}
