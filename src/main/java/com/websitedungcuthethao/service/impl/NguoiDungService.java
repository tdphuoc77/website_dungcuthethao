package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.repository.NguoiDungRepository;
import com.websitedungcuthethao.service.INguoiDungService;

@Service
public class NguoiDungService  implements INguoiDungService{
	@Autowired
	private NguoiDungRepository nguoiDungRepository;

	@Override
	public List<NguoiDung> findAll() {
		return nguoiDungRepository.findAll();
	}

	@Override
	public void saveNguoiDung(NguoiDung nguoiDung) {
		nguoiDungRepository.save(nguoiDung);
	}

	@Override
	public void UpdateNguoiDung(NguoiDung nguoiDung) {
		
	}

	@Override
	public NguoiDung findById(int id) {
		return nguoiDungRepository.findOne(id);
	}

	@Override
	public List<NguoiDung> findByTenAndHo(String ten, String ho) {
		return nguoiDungRepository.findByTenAndHo(ten, ho);
	}
}
