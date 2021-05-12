package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.NhaCungCap;

public interface NhaCungCapRepository extends JpaRepository<NhaCungCap, Long> {
	List<NhaCungCap> findByTenNhaCungCap(String ten);
}
