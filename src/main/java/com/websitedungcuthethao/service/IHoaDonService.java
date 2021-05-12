package com.websitedungcuthethao.service;

import com.websitedungcuthethao.entity.HoaDon;

public interface IHoaDonService {
	void saveHoaDon(HoaDon hoaDon);
	HoaDon findById(Long id);
}
