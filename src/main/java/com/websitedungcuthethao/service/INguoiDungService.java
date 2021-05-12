package com.websitedungcuthethao.service;

import java.util.List;

import com.websitedungcuthethao.entity.NguoiDung;

public interface INguoiDungService {
	List<NguoiDung> findAll();
	void saveNguoiDung(NguoiDung nguoiDung);
	void UpdateNguoiDung(NguoiDung nguoiDung);
	NguoiDung findById(Long id);
	List<NguoiDung> findByTenAndHo(String ten,String ho);
	
}
