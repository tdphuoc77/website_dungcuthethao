package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void updateAnhSP(AnhSanPham anhSanPham) {
		AnhSanPham asp=anhSanPhamRepository.findOne((long) anhSanPham.getId());
		
		if(asp!=null) {
			anhSanPhamRepository.save(anhSanPham);
		}
	}

	@Override
	public void deleteAnhSP(Long id) {
		if(anhSanPhamRepository.findOne(id)!=null) {
			anhSanPhamRepository.delete(id);
		}
	}

	
	

}
