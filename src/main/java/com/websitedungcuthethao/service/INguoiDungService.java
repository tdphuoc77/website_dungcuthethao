package com.websitedungcuthethao.service;

import java.util.List;

import com.websitedungcuthethao.dto.NguoiDungDTONew;
import com.websitedungcuthethao.dto.TaiKhoanDTO;
import com.websitedungcuthethao.entity.NguoiDung;

public interface INguoiDungService {
	List<NguoiDung> findAll();
	void saveNguoiDung(NguoiDung nguoiDung);
	void UpdateNguoiDung(NguoiDungDTONew nguoiDungDTONew);
	NguoiDung findById(Long id);
	List<NguoiDung> findByTenAndHo(String ten,String ho);
	
	void doiMatKhau(TaiKhoanDTO taiKhoanDTO);
}
