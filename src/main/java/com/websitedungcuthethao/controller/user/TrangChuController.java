package com.websitedungcuthethao.controller.user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.DanhMucService;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
@RequestMapping({"/","trang-chu"})
public class TrangChuController {
	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	
	@GetMapping
	public String index (Model model) {
		ArrayList<SanPham> dsSanPham = (ArrayList<SanPham>) sanPhamService.findAll();
		ArrayList<DanhMuc> dsDanhMuc = (ArrayList<DanhMuc>) danhMucService.findAll();
		model.addAttribute("dsSanPham",dsSanPham );
		model.addAttribute("dsDanhMuc",dsDanhMuc );
		return "user/home";
	}
	
}
