package com.websitedungcuthethao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(ChiTietHoaDon_PK.class)
@ToString
public class ChiTietHoaDon {
	@Id
	@ManyToOne
	@JoinColumn(name = "sanphamID")
	private SanPham sanpham;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "hoadonID")
	private HoaDon hoadon;
	
	private int giamGia;
	private int soLuong;
	
}
