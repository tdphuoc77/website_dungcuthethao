package com.websitedungcuthethao.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private String ten;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "danhmucID", nullable = false)
	private DanhMuc danhmuc;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nhacungcapID", nullable = false)
	private NhaCungCap nhacungcap;
	
	@NonNull
	private String moTa;
	@NonNull
	private String  thuongHieu;
	@NonNull
	private String noiDung;
	@NonNull
	private double gia;
	@NonNull
	private double giaGiam;
	@NonNull
	private int soLuong;
	@NonNull
	private String anhDaiDien;
	@NonNull
	private int luotXem;
	@NonNull
	private String video;
	@NonNull
	private int thoiGianBaoHanh;
	@NonNull
	private boolean trangThai;
	@NonNull
	private LocalDate ngayTao;
	@NonNull
	private int nguoiTao;
	@NonNull
	private LocalDate ngaySua;
	@NonNull
	private int nguoiSua;
	
//	@OneToMany(mappedBy = "sanpham")
//	private List<GiaTriThuocTinhSanPham> dsThuocTinhSanPham = new ArrayList<GiaTriThuocTinhSanPham>();
}
