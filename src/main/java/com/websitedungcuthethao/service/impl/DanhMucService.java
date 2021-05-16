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

	@Override
	public List<DanhMuc> findAllDanhMucConById(Long id) {
		return danhMucRepository.findAllDanhMucConById(id);
	}

	@Override
	public List<DanhMuc> findAllDanhMucCha() {
		return danhMucRepository.findByDanhMucChaNull();
	}

	@Override
	public void updateDanhMuc(DanhMuc danhMuc) {
		DanhMuc dM= danhMucRepository.findOne(danhMuc.getId());
		if(dM!=null) {
			danhMucRepository.save(danhMuc);
		}		
	}


	
}
