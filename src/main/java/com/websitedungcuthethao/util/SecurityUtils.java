package com.websitedungcuthethao.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.websitedungcuthethao.dto.NguoiDungDTO;



public class SecurityUtils {
	public static NguoiDungDTO getPrincipal() {
		NguoiDungDTO nguoiDungDTO = (NguoiDungDTO) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
        return nguoiDungDTO;
    }
	
	@SuppressWarnings("unchecked")
	public static List<String> getAuthorities() {
		List<String> results = new ArrayList<>();
		List<GrantedAuthority> authorities = (List<GrantedAuthority>)(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        for (GrantedAuthority authority : authorities) {
            results.add(authority.getAuthority());
        }
		return results;
	}
}
