package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.NguoiDungDTONew;
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
	@SuppressWarnings("unchecked")
	@Override
	public void updateDiaChi(NguoiDungDTONew nguoiDungDTONew) {
		List<DiaChi> list = (List<DiaChi>) nguoiDungDTONew.getDsDiaChi();
		for (DiaChi diaChi : list) {
			diaChiRepository.save(diaChi);
		}		
	}
	

}
