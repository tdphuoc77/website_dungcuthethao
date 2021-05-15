package com.websitedungcuthethao.controller.nguoidung;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chitiet-sanpham")
public class ChiTietSanPhamController {
	@GetMapping
	public String index(Model model) {
		return null;
	}

}
