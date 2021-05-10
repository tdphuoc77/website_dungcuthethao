package com.websitedungcuthethao.service;

import java.util.List;

import com.websitedungcuthethao.entity.NhaCungCap;

public interface INhaCungCapService {
	NhaCungCap saveNCC(NhaCungCap nhaCungCap);
	boolean updateNCC(int id);
	List<NhaCungCap> findByTenNhaCungCap(String ten);
	NhaCungCap findNCCByID(int id);
}
