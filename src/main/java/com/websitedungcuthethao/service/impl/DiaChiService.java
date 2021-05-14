package com.websitedungcuthethao.service.impl;

import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.entity.DiaChi;
import com.websitedungcuthethao.repository.DiaChiRepository;
import com.websitedungcuthethao.service.IDiaChiService;

@Service
public class DiaChiService implements IDiaChiService{
	private DiaChiRepository diaChiRepository;
	@Override
	public void saveDiaChi(DiaChi diaChi) {
		 diaChiRepository.save(diaChi);
	}
	@Override
	public boolean updateDiaChi( ) {
		
	}

}
