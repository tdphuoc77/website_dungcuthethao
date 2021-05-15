package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.entity.LoaiNguoiDung;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.repository.NguoiDungRepository;

@Transactional
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private NguoiDungRepository nguoiDungRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		NguoiDung nguoiDung= nguoiDungRepository.findOneByTenDangNhapAndTrangThai(username, SystemConstant.ACTIVE_STATUS);
		
		if(nguoiDung ==null) {
			throw new UsernameNotFoundException("Không tìm thấy người dùng");
		}
		// put thong tin nguoi dung vao security  và duy tri dang nhap
		System.out.println(nguoiDung.toString());
		LoaiNguoiDung loaiNguoiDung= nguoiDung.getLoainguoidung();
		System.out.println(loaiNguoiDung.toString());
		GrantedAuthority anthority=new SimpleGrantedAuthority(loaiNguoiDung.getTenLoai());
		
		NguoiDungDTO nguoiDungDTO= new NguoiDungDTO(nguoiDung.getTenDangNhap(), nguoiDung.getMatKhau(), true, true, true, true, anthority);
		return nguoiDungDTO;
	}

}
