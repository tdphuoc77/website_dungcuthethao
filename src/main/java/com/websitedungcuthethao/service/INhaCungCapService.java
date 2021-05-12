package com.websitedungcuthethao.service;

import java.util.List;

import com.websitedungcuthethao.entity.NhaCungCap;

public interface INhaCungCapService {
	NhaCungCap saveNCC(NhaCungCap nhaCungCap);
	boolean updateNCC(Long id);
	List<NhaCungCap> findByTenNhaCungCap(String ten);
	NhaCungCap findNCCByID(Long id);
}
