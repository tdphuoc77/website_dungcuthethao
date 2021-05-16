package com.websitedungcuthethao.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.NhaCungCap;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.repository.DanhMucRepository;
import com.websitedungcuthethao.repository.ISanPhamRepository;
import com.websitedungcuthethao.repository.NhaCungCapRepository;
import com.websitedungcuthethao.service.ISanPhamService;

@Service
public class SanPhamService implements ISanPhamService {
	@Autowired
	private ISanPhamRepository sanPhamRepository;
	
	@Autowired
	private DanhMucRepository danhMucRepository;
	
	@Autowired
	private NhaCungCapRepository nhaCungCapRepository;
	
	@Override
	public List<SanPham> findAll() {
		List<SanPham> list = sanPhamRepository.findAll();
		return list;
	}	
	@Override
	public SanPham findById(Long id) {
		return sanPhamRepository.findOne(id);
	}
	@Override
	public List<SanPham> findByTen(String ten) {
		return sanPhamRepository.findByTen(ten);
	}
	@Override
	public void deleteById(Long id) {
		if(sanPhamRepository.findOne(id)!=null) {
			sanPhamRepository.delete(sanPhamRepository.findOne(id));
		}
		 
	}
	@Override
	public void save(SanPham sanPham) {
		 sanPhamRepository.save(sanPham);
		
	}
	
	
	@Override
	public void updateSanPham(SanPhamDTO sanPhamDTO) {
		SanPham sanPham= sanPhamRepository.findOne(sanPhamDTO.getId());
		if(sanPham!=null) {
			sanPham.setTen(sanPhamDTO.getTen());
			sanPham.setGia(sanPhamDTO.getGia());
			sanPham.setAnhDaiDien(sanPhamDTO.getAnhDaiDien());
			sanPham.setGiaGiam(sanPhamDTO.getGiaGiam());
			sanPham.setSoLuotXem(sanPhamDTO.getSoLuotXem());
			sanPham.setMoTa(sanPhamDTO.getMoTa());
			sanPham.setNgaySua(LocalDate.now());
			sanPham.setNguoiSua(sanPhamDTO.getNguoiSua());
			sanPham.setNoiDung(sanPhamDTO.getNoiDung());
			sanPham.setSoLuong(sanPhamDTO.getSoLuong());
			sanPham.setThuongHieu(sanPhamDTO.getThuongHieu());
			sanPham.setTrangThai(sanPhamDTO.isTrangThai());
			sanPham.setThoiGianBaoHanh(sanPhamDTO.getThoiGianBaoHanh());
			sanPham.setVideo(sanPhamDTO.getVideo());
			sanPham.setDanhmuc(danhMucRepository.findByTen(sanPhamDTO.getTenDanhMuc()));
			
			List<NhaCungCap> caps=nhaCungCapRepository.findByTenNhaCungCap(sanPhamDTO.getTenNhaCungCap());
			
			sanPham.setNhacungcap(caps.get(0));
			sanPham.setSoLuotMua(sanPhamDTO.getSoLuotMua());
			
			sanPhamRepository.save(sanPham);
			
		}
		
	}
	@Override
	public List<SanPham> findTop3SanPhamBySoLuotXem() {
		// TODO Auto-generated method stub
		return sanPhamRepository.findTop3SanPhamBySoLuotXem();
	}
	@Override
	public List<SanPham> findTop3SanPhamGiamGiaNhieuNhat() {
		// TODO Auto-generated method stub
		return sanPhamRepository.findTop3SanPhamGiamGiaNhieuNhat();
	}
	
}
