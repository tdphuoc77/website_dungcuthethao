package com.websitedungcuthethao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
public class BinhLuan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	
	@NonNull
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanphamID")
	private SanPham sanpham;
	
	@NonNull
	private String binhLuan;
	@NonNull
	private int danhGia;
	@NonNull
	private String anhSanPham;
}
