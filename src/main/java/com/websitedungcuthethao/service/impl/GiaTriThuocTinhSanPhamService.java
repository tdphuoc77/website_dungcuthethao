package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.GiaTriThuocTinhSanPham;
import com.websitedungcuthethao.repository.GiaTriThuocTinhSanPhamRepository;
import com.websitedungcuthethao.service.IGiaTriThuocTinhSanPhamService;

@Service
public class GiaTriThuocTinhSanPhamService implements IGiaTriThuocTinhSanPhamService{

	@Autowired
	private GiaTriThuocTinhSanPhamRepository giaTriThuocTinhSanPhamRepository;

	@Override
	public void saveGTTTSP(GiaTriThuocTinhSanPham giaTriThuocTinhSanPham) {
		giaTriThuocTinhSanPhamRepository.save(giaTriThuocTinhSanPham);
	}

	@Override
	public void updateGTTTSP(GiaTriThuocTinhSanPham giaTriThuocTinhSanPham) {
		
	}
}
