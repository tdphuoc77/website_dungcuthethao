package com.websitedungcuthethao.service;

import java.util.List;

import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.SanPham;

public interface ISanPhamService {
	List<SanPham> findAll();
	List<SanPham> findByTen(String ten);
	boolean deleteById(Long id);
	void save (SanPham sanPham);
	SanPham findById(Long id);
	void updateSanPham(SanPhamDTO sanPhamDTO);
	
}
