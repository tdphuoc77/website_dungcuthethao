package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.repository.IDanhMucRepository;
import com.websitedungcuthethao.service.IDanhMucService;

@Service
public class DanhMucService implements IDanhMucService {
	
	@Autowired
	IDanhMucRepository danhMucRepository;

	@Override
	public List<DanhMuc> findAll() {
		return danhMucRepository.findAll();
	}

}
