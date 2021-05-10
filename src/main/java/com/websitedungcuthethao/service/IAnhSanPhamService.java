package com.websitedungcuthethao.service;

import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.AnhSanPham;

public interface IAnhSanPhamService {
	void saveAnhSP(AnhSanPham anhSanPham);
	void updateAnhSP(SanPhamDTO sanPhamDTO);
}
