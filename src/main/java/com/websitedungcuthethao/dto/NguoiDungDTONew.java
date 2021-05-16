package com.websitedungcuthethao.dto;

import java.util.HashSet;
import java.util.Set;

import com.websitedungcuthethao.entity.DiaChi;

public class NguoiDungDTONew {
	private Long id;

	private String ho;

	private String ten;

	private boolean gioiTinh;

	private String email;

	private String soDienThoai;



	Set<DiaChi> dsDiaChi = new HashSet<DiaChi>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	
	public Set<DiaChi> getDsDiaChi() {
		return dsDiaChi;
	}

	public void setDsDiaChi(Set<DiaChi> dsDiaChi) {
		this.dsDiaChi = dsDiaChi;
	}

}
