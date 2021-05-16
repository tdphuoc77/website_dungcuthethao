package com.websitedungcuthethao.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class SanPham extends BaseEntity {

	private String ten;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "danhmucID", nullable = false)
	private DanhMuc danhmuc;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nhacungcapID", nullable = false)
	private NhaCungCap nhacungcap;

	private String moTa;

	private String thuongHieu;

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
	
	@LastModifiedDate
	private LocalDate ngaySua;

	@LastModifiedBy
	private String nguoiSua;

//	@OneToMany(mappedBy = "sanpham")
//	private List<GiaTriThuocTinhSanPham> dsThuocTinhSanPham = new ArrayList<GiaTriThuocTinhSanPham>();
}
