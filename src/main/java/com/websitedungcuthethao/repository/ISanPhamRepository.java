package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.websitedungcuthethao.entity.SanPham;

public interface ISanPhamRepository extends JpaRepository<SanPham, Long> {
	List<SanPham> findAll();
	List<SanPham> findByTen(String ten);
	boolean deleteById(Long id);
	
	@Query(value = "SELECT TOP 3 *  FROM SANPHAM", nativeQuery = true)
	List<SanPham> findSanPhamGoiY();
}
