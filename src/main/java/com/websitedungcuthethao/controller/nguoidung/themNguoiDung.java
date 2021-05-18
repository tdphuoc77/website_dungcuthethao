package com.websitedungcuthethao.controller.nguoidung;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.dto.NguoiDungDTONew;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.LoaiNguoiDungService;
import com.websitedungcuthethao.service.impl.NguoiDungService;

@Controller
public class themNguoiDung {
	private static final boolean ACTIVE_STATUS = true;
	
	@Autowired
	private NguoiDungService nguoiDungService;

	@Autowired
	private LoaiNguoiDungService loaiNguoiDungService;

	@RequestMapping(value = "/dangkytaikhoan", method = RequestMethod.POST)
	public String themNguoiDung(@ModelAttribute("nguoiDungDTONew") NguoiDungDTONew nguoiDungDTONew) {
		System.out.println(1);
		NguoiDung nguoiDung = new NguoiDung(LocalDate.now(), loaiNguoiDungService.findByID(1), nguoiDungDTONew.getHo(),
				nguoiDungDTONew.getTen(), nguoiDungDTONew.isGioiTinh(), nguoiDungDTONew.getNgaySinh(), nguoiDungDTONew.getEmail(),
				nguoiDungDTONew.getSoDienThoai(), nguoiDungDTONew.getTenDangNhap(),
				BCrypt.hashpw(nguoiDungDTONew.getMatKhau(), BCrypt.gensalt(12)), SystemConstant.ACTIVE_STATUS,
				nguoiDungDTONew.getDsDiaChi());
		
		nguoiDungService.saveNguoiDung(nguoiDung);
		
		return "redirect:/trang-chu";
	}

}
