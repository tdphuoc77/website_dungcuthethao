package com.websitedungcuthethao.service;

import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.GiaTriThuocTinhSanPham;

public interface IGiaTriThuocTinhSanPhamService {
	void saveGTTTSP(GiaTriThuocTinhSanPham giaTriThuocTinhSanPham);
	void updateGTTTSP(SanPhamDTO sanPhamDTO);
	GiaTriThuocTinhSanPham findByIdSanPhamAndIDThuocTinh(Long idSP,Long idTT);
}
