package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.entity.LoaiNguoiDung;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.repository.NguoiDungRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private NguoiDungRepository nguoiDungRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		NguoiDung nguoiDung= nguoiDungRepository.findOneByTenDangNhap(username);
		
		if(nguoiDung ==null) {
			throw new UsernameNotFoundException("User not found");
		}
		System.out.println(nguoiDung.toString());
		LoaiNguoiDung loaiNguoiDung= nguoiDung.getLoainguoidung();
		System.out.println(loaiNguoiDung.toString());
		GrantedAuthority anthority=new SimpleGrantedAuthority(loaiNguoiDung.getId()+"");
		
		NguoiDungDTO nguoiDungDTO= new NguoiDungDTO(nguoiDung.getTenDangNhap(), nguoiDung.getMatKhau(), true, true, true, true, anthority);
		
		return nguoiDungDTO;
	}

}
