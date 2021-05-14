package com.websitedungcuthethao.service;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.entity.DiaChi;

public interface IDiaChiService {
	void saveDiaChi(DiaChi diaChi);
	boolean updateDiaChi(NguoiDungDTO nguoiDungDTO);
}
