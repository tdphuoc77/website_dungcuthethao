package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.LoaiNguoiDung;
import com.websitedungcuthethao.repository.LoaiNguoiDungReoisitory;
import com.websitedungcuthethao.service.ILoaiNguoiDungService;

@Service
public class LoaiNguoiDungService implements ILoaiNguoiDungService{
	
	@Autowired
	private LoaiNguoiDungReoisitory loaiNguoiDungRepository;

	@Override
	public LoaiNguoiDung findByID(int id) {
		return loaiNguoiDungRepository.findOne(id);
	}

}
