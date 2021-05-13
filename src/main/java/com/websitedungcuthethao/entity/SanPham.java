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
@Entity
@ToString
public class SanPham extends BaseEntity{

	private String ten;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "danhmucID", nullable = false)
	private DanhMuc danhmuc;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nhacungcapID", nullable = false)
	private NhaCungCap nhacungcap;
	
	
	private String moTa;
	
	private String  thuongHieu;
	
	private String noiDung;
	
	private double gia;
	
	private double giaGiam;
	
	private int soLuong;
	
	private String anhDaiDien;
	
	private int soLuotXem;
	private int soLuotMua;
	
	private String video;
	
	private int thoiGianBaoHanh;
	
	private boolean trangThai;
	
//	@OneToMany(mappedBy = "sanpham")
//	private List<GiaTriThuocTinhSanPham> dsThuocTinhSanPham = new ArrayList<GiaTriThuocTinhSanPham>();
}
