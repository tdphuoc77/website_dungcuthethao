package com.websitedungcuthethao.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@Entity
@ToString
public class NguoiDung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreatedDate
	private LocalDate ngayTao;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "loainguoidungID")
	private LoaiNguoiDung loainguoidung;

	private String ho;

	private String ten;

	private boolean gioiTinh;

	private String email;

	private String soDienThoai;

	private String tenDangNhap;

	private String matKhau;
	
	private boolean trangThai;

	@OneToMany(mappedBy = "nguoidung")
	Set<DiaChi> dsDiaChi = new HashSet<DiaChi>();
}
