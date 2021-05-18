package com.websitedungcuthethao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.NguoiDungDTONew;
import com.websitedungcuthethao.dto.TaiKhoanDTO;
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
	public NguoiDung findById(Long id) {
		return nguoiDungRepository.findOne(id);
	}

	@Override
	public List<NguoiDung> findByTenAndHo(String ten, String ho) {
		return nguoiDungRepository.findByTenAndHo(ten, ho);
	}

	@Override
	public void UpdateNguoiDung(NguoiDungDTONew nguoiDungDTONew) {
		NguoiDung nguoiDung= nguoiDungRepository.findOne(nguoiDungDTONew.getId());
		if(nguoiDung!=null){
			nguoiDung.setHo(nguoiDungDTONew.getHo());
			nguoiDung.setTen(nguoiDungDTONew.getTen());
			nguoiDung.setGioiTinh(nguoiDungDTONew.isGioiTinh());
			nguoiDung.setEmail(nguoiDungDTONew.getEmail());
			nguoiDung.setSoDienThoai(nguoiDungDTONew.getSoDienThoai());
			nguoiDung.setNgaySinh(nguoiDungDTONew.getNgaySinh());
			nguoiDungRepository.save(nguoiDung);
		}
		
	}

	@Override
	public void doiMatKhau(TaiKhoanDTO taiKhoanDTO) {
		NguoiDung nguoiDung= nguoiDungRepository.findOneByTenDangNhap(taiKhoanDTO.getTenDangNhap());
		if(nguoiDung!=null) {
			nguoiDung.setMatKhau(taiKhoanDTO.getMatKhau());
		}
	}

}
