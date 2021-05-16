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
		if(thuocTinhSanPhamRepository.findOne(thuocTinhSanPham.getId())!=null) {
			thuocTinhSanPhamRepository.save(thuocTinhSanPham);
		}
		
	}

	@Override
	public ThuocTinhSanPham findById(Long id) {
		return thuocTinhSanPhamRepository.findOne(id);
	}

	@Override
	public ThuocTinhSanPham findOneByTenThuoctinh(String ten) {
		return thuocTinhSanPhamRepository.findOneByTenThuoctinh(ten);
	}
}
