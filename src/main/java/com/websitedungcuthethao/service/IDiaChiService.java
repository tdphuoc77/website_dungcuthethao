package com.websitedungcuthethao.service;

import com.websitedungcuthethao.dto.NguoiDungDTONew;
import com.websitedungcuthethao.entity.DiaChi;

public interface IDiaChiService {
	void saveDiaChi(DiaChi diaChi);
	void updateDiaChi(NguoiDungDTONew nguoiDungDTONew);
}
