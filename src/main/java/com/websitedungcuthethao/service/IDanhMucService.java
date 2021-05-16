package com.websitedungcuthethao.service;

import java.util.List;

import com.websitedungcuthethao.entity.DanhMuc;

public interface IDanhMucService {
	List<DanhMuc> findAll();
	DanhMuc findByTen(String ten);
	List<DanhMuc> findAllDanhMucConById(Long id);
	List<DanhMuc> findAllDanhMucCha();
	void updateDanhMuc(DanhMuc danhMuc);
}
