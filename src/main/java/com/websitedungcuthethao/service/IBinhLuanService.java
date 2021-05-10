package com.websitedungcuthethao.service;

import com.websitedungcuthethao.entity.BinhLuan;

public interface IBinhLuanService {
	BinhLuan save(BinhLuan binhLuan);
	boolean delete(int id);
}
