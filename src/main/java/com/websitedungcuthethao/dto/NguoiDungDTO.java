package com.websitedungcuthethao.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class NguoiDungDTO extends User {

	@SuppressWarnings("unchecked")
	public NguoiDungDTO(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			GrantedAuthority anthority) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,  (Collection<? extends GrantedAuthority>) anthority);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
