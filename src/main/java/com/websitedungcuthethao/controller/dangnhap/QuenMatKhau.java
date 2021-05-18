package com.websitedungcuthethao.controller.dangnhap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuenMatKhau {

	
	@RequestMapping("/tim-tai-khoan")
	public ModelAndView timTaiKhoan() {
		return new ModelAndView("doimatkhau/timtaikhoan");
	}
}
