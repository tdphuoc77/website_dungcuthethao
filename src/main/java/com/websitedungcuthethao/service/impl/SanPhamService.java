package com.websitedungcuthethao.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.repository.DanhMucRepository;
import com.websitedungcuthethao.repository.ISanPhamRepository;
import com.websitedungcuthethao.service.ISanPhamService;

@Service
public class SanPhamService implements ISanPhamService {
	@Autowired
	private ISanPhamRepository sanPhamRepository;
	@Autowired
	private DanhMucRepository danhMucRepository;
	@Override
	public List<SanPham> findAll() {
		List<SanPham> list = sanPhamRepository.findAll();
		return list;
	}	
	@Override
	public SanPham findById(int id) {
		return sanPhamRepository.findOne(id);
	}
	@Override
	public List<SanPham> findByTen(String ten) {
		return sanPhamRepository.findByTen(ten);
	}
	@Override
	public boolean delete(int id) {
		return sanPhamRepository.delete(id);
	}
	@Override
	public void save(SanPham sanPham) {
		 sanPhamRepository.save(sanPham);
		
	}
	
	
	@Override
	public void updateSanPham(SanPhamDTO sanPhamDTO) {
		SanPham sanPham= sanPhamRepository.findOne(sanPhamDTO.getId());
		sanPham.setTen(sanPhamDTO.getTen());
		sanPham.setGia(sanPhamDTO.getGia());
		sanPham.setAnhDaiDien(sanPhamDTO.getAnhDaiDien());
		sanPham.setDanhmuc(danhMucRepository.findByTen(sanPhamDTO.getTenDanhMuc()));
		sanPham.setGiaGiam(sanPhamDTO.getGiaGiam());
		sanPham.setLuotXem(sanPhamDTO.getLuotXem());
		sanPham.setMoTa(sanPhamDTO.getMoTa());
		sanPham.setNgaySua(LocalDate.now());
		sanPham.setNgayTao(sanPhamDTO.getNgayTao());
		sanPham.setNguoiSua(sanPhamDTO.getNguoiSua());
		sanPham.setNguoiTao(sanPhamDTO.getNguoiTao());
		sanPham.setNoiDung(sanPhamDTO.getNoiDung());
		sanPham.setSoLuong(sanPhamDTO.getSoLuong());
		sanPham.setThuongHieu(sanPhamDTO.getThuongHieu());
		sanPham.setTrangThai(sanPhamDTO.isTrangThai());
		sanPham.setThoiGianBaoHanh(sanPhamDTO.getThoiGianBaoHanh());
		sanPham.setVideo(sanPhamDTO.getVideo());
		
	}
	
	
}
