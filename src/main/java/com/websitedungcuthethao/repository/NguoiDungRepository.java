package com.websitedungcuthethao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.NguoiDung;

public interface NguoiDungRepository extends JpaRepository<NguoiDung,Integer> {
	NguoiDung findOneByTenDangNhap(String tenDangNhap);
}
