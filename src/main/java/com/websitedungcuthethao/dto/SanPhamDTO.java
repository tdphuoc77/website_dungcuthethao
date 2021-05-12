package com.websitedungcuthethao.dto;

import java.time.LocalDate;

import com.websitedungcuthethao.entity.BaseEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class SanPhamDTO extends BaseEntity {
	private String ten;
	private String tenDanhMuc;
	private String tenNhaCungCap;
	private String moTa;
	private String thuongHieu;
	private String noiDung;
	private double gia;
	private double giaGiam;
	private int soLuong;
	private String anhDaiDien;
	private int luotXem;
	private String video;
	private int thoiGianBaoHanh;
	private boolean trangThai;
	private String tenThuoctinh;
	private String giaTriThuocTinh;
}
