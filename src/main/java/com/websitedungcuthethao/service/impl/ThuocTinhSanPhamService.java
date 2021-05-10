package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.ThuocTinhSanPham;
import com.websitedungcuthethao.repository.ThuocTinhSanPhamRepository;
import com.websitedungcuthethao.service.IThuocTinhSanPhamService;

@Service
public class ThuocTinhSanPhamService implements IThuocTinhSanPhamService {

	@Autowired
	private ThuocTinhSanPhamRepository thuocTinhSanPhamRepository;

	@Override
	public void saveTTSP(ThuocTinhSanPham thuocTinhSanPham) {
		thuocTinhSanPhamRepository.save(thuocTinhSanPham);
		
	}

	@Override
	public void updateTTSP(ThuocTinhSanPham thuocTinhSanPham) {
		// TODO Auto-generated method stub
		
	}
}
