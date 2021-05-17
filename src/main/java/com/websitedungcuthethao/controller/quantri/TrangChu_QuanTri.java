package com.websitedungcuthethao.controller.quantri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quan-tri/trang-chu")
public class TrangChu_QuanTri {
	@GetMapping
	public String index() {
		return "quantri/trangchu";
	}
}
