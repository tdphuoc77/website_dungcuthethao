package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.NguoiDung;

public interface NguoiDungRepository extends JpaRepository<NguoiDung,Long> {
	NguoiDung findOneByTenDangNhap(String tenDangNhap);
	List<NguoiDung> findByTenAndHo(String ten,String ho);
	
}
