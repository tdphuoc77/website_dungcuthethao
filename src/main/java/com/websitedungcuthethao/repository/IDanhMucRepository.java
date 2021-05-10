package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.DanhMuc;

public interface IDanhMucRepository extends JpaRepository<DanhMuc, Integer> {
	List<DanhMuc> findAll();
}
