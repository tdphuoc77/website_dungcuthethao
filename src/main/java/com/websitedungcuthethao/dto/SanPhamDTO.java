package com.websitedungcuthethao.dto;

import java.time.LocalDate;

import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.entity.NhaCungCap;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class SanPhamDTO {
	private Long id;
	private LocalDate ngayTao;
	private String nguoiTao;
	private String ten;
	private DanhMuc danhmuc;
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
	private LocalDate ngaySua;
	private String nguoiSua;
	private String tenThuoctinh;
	private String giaTriThuocTinh;
}
