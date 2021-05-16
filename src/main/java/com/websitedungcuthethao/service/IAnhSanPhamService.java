package com.websitedungcuthethao.service;

import com.websitedungcuthethao.entity.AnhSanPham;

public interface IAnhSanPhamService {
	void saveAnhSP(AnhSanPham anhSanPham);
	void updateAnhSP(AnhSanPham anhSanPham);
	void deleteAnhSP(Long id);
}
