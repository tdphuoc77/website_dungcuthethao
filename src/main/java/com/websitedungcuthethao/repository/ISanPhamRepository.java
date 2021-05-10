package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.SanPham;

public interface ISanPhamRepository extends JpaRepository<SanPham, Integer> {
	List<SanPham> findAll();

	List<SanPham> findByTen(String ten);


	boolean delete(int id);
}
