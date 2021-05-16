package com.websitedungcuthethao.service;

import com.websitedungcuthethao.entity.ThuocTinhSanPham;

public interface IThuocTinhSanPhamService {
	void saveTTSP(ThuocTinhSanPham thuocTinhSanPham);
	void updateTTSP(ThuocTinhSanPham thuocTinhSanPham);
	ThuocTinhSanPham findById(Long id);
	ThuocTinhSanPham findOneByTenThuoctinh(String ten);
}
