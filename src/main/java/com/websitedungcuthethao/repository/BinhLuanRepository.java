package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.BinhLuan;

public interface BinhLuanRepository extends JpaRepository<BinhLuan, Long>{
	List<BinhLuan> findAll();
}
