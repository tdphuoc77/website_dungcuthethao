package com.websitedungcuthethao.entity;

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
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@ToString
public class NguoiDung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "loainguoidungID")
	private LoaiNguoiDung loainguoidung;
	
	
	@NonNull
	private String  ho;
	@NonNull
	private String ten;
	@NonNull
	private boolean gioiTinh;
	@NonNull
	private String email;
	@NonNull
	private String soDienThoai;
	@NonNull
	private String tenDangNhap;
	@NonNull
	private String matKhau;
	
	
	@OneToMany(mappedBy = "nguoidung")
	Set<DiaChi> dsDiaChi = new HashSet<DiaChi>();
}
