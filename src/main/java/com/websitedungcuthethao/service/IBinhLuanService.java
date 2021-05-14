package com.websitedungcuthethao.service;

import com.websitedungcuthethao.entity.BinhLuan;

public interface IBinhLuanService {
	BinhLuan save(BinhLuan binhLuan);
	void deleteById(Long id);
}
