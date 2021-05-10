package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.repository.ISanPhamRepository;
import com.websitedungcuthethao.service.ISanPhamService;

@Service
public class SanPhamService implements ISanPhamService {
	@Autowired
	private ISanPhamRepository sanPhamRepository;

	@Override
	public List<SanPham> findAll() {
		// TODO Auto-generated method stub
		List<SanPham> list = sanPhamRepository.findAll();
		return list;
	}
}
