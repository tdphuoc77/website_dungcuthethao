package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.AnhSanPham;
import com.websitedungcuthethao.repository.AnhSanPhamRepository;
import com.websitedungcuthethao.service.IAnhSanPhamService;

@Service
public class AnhSanPhamService implements IAnhSanPhamService {
	@Autowired
	private AnhSanPhamRepository anhSanPhamRepository;

	@Override
	public void saveAnhSP(AnhSanPham anhSanPham) {
		anhSanPhamRepository.save(anhSanPham);
	}

	
	@Override
	public void updateAnhSP(SanPhamDTO sanPhamDTO) {
		
	}

}