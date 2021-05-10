package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.BinhLuan;
import com.websitedungcuthethao.repository.BinhLuanRepository;
import com.websitedungcuthethao.service.IBinhLuanService;

@Service
public class BinhLuanService implements IBinhLuanService{

	@Autowired
	private BinhLuanRepository binhLuanRepository;
	
	@Override
	public BinhLuan save(BinhLuan  binhLuan) {
		return binhLuanRepository.save(binhLuan);
	}
	@Override
	public boolean delete(int id) {
		return binhLuanRepository.delete(id);
	}
	
	
}
