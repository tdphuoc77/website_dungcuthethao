package com.websitedungcuthethao.controller.nguoidung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.dto.NguoiDungDTONew;

@Controller
@RequestMapping("/dangky")
public class dangKyTaiKhoanController {
	@GetMapping
	public ModelAndView dangKy() {
		ModelAndView mav= new ModelAndView();
		NguoiDungDTONew nguoiDungDTONew= new NguoiDungDTONew();
		return new ModelAndView("dangkytaikhoan/dangky_nguoidung","nguoiDungDTONew",nguoiDungDTONew);
	}
	
}
