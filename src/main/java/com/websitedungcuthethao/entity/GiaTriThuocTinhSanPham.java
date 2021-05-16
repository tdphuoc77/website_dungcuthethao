package com.websitedungcuthethao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@IdClass(GiaTriThuocTinhSanPham_PK.class)
@Getter
@Setter
@ToString
public class GiaTriThuocTinhSanPham {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "sanphamID")
	private SanPham sanpham;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "thuoctinhID")
	private ThuocTinhSanPham thuoctinhsanpham;
	
	private String giaTriThuocTinh;
	
}
