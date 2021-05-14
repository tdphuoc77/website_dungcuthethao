package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websitedungcuthethao.entity.BinhLuan;
import com.websitedungcuthethao.repository.BinhLuanRepository;
import com.websitedungcuthethao.service.IBinhLuanService;

@Transactional
@Service
public class BinhLuanService implements IBinhLuanService{

	@Autowired
	private BinhLuanRepository binhLuanRepository;
	
	@Override
	public BinhLuan save(BinhLuan  binhLuan) {
		return binhLuanRepository.save(binhLuan);
	}
	@Override
	public void deleteById(Long id) {
		 binhLuanRepository.delete(binhLuanRepository.findOne(id));
	}
	
	
}
