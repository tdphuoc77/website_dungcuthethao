package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.HoaDon;
import com.websitedungcuthethao.repository.HoaDonRepository;
import com.websitedungcuthethao.service.IHoaDonService;

@Service
public class HoaDonService implements IHoaDonService {
	@Autowired
	private HoaDonRepository hoaDonRepository;

	@Override
	public void saveHoaDon(HoaDon hoaDon) {
		hoaDonRepository.save(hoaDon);
	}

	@Override
	public HoaDon findById(Long id) {
		return hoaDonRepository.findOne(id);
	}
	
}
