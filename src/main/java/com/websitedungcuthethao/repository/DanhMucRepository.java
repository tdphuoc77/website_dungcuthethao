package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.DanhMuc;

public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer> {
	DanhMuc findByTen(String ten);
}