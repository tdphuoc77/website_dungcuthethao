package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.repository.DanhMucRepository;
import com.websitedungcuthethao.service.IDanhMucService;

@Service
public class DanhMucService implements IDanhMucService {
	
	@Autowired
	DanhMucRepository danhMucRepository;

	public List<DanhMuc> findAll() {
		return danhMucRepository.findAll();
	}

	@Override
	public DanhMuc findByTen(String ten) {
		return danhMucRepository.findByTen(ten);
	}


	
}
