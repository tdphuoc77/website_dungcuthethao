package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.ChiTietHoaDon;
import com.websitedungcuthethao.repository.ChiTietHoaDonRepository;
import com.websitedungcuthethao.service.IChiTietHoaDonService;

@Service
public class ChiTietHoaDonService  implements IChiTietHoaDonService{
	@Autowired
	private ChiTietHoaDonRepository chiTietHoaDonRepository;

	@Override
	public void saveCTHD(ChiTietHoaDon chiTietHoaDon) {
		chiTietHoaDonRepository.save(chiTietHoaDon);
	}

	@Override
	public void updateCTHD(ChiTietHoaDon chiTietHoaDon) {
		// TODO Auto-generated method stub
		
	}

}
