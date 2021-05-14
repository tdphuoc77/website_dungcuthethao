package com.websitedungcuthethao.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class BinhLuan extends BaseEntity {
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanphamID")
	private SanPham sanpham;
	private String binhLuan;
	private int danhGia;
	private String anhSanPham;
	private LocalDate ngaySua;

}
