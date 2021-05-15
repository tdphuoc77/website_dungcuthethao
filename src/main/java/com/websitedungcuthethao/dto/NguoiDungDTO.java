package com.websitedungcuthethao.dto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.websitedungcuthethao.entity.DiaChi;
import com.websitedungcuthethao.entity.LoaiNguoiDung;

public class NguoiDungDTO extends User {

	@SuppressWarnings("unchecked")
	public NguoiDungDTO(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			GrantedAuthority anthority) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,  (Collection<? extends GrantedAuthority>) anthority);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;

	private LocalDate ngayTao;
	private LoaiNguoiDung loainguoidung;

	private String ho;

	private String ten;

	private boolean gioiTinh;

	private String email;

	private String soDienThoai;

	private String tenDangNhap;

	private String matKhau;

	Set<DiaChi> dsDiaChi = new HashSet<DiaChi>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalDate ngayTao) {
		this.ngayTao = ngayTao;
	}

	public LoaiNguoiDung getLoainguoidung() {
		return loainguoidung;
	}

	public void setLoainguoidung(LoaiNguoiDung loainguoidung) {
		this.loainguoidung = loainguoidung;
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

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public Set<DiaChi> getDsDiaChi() {
		return dsDiaChi;
	}

	public void setDsDiaChi(Set<DiaChi> dsDiaChi) {
		this.dsDiaChi = dsDiaChi;
	}

	public NguoiDungDTO(String username, String password, Collection<? extends GrantedAuthority> authorities, Long id,
			LocalDate ngayTao, LoaiNguoiDung loainguoidung, String ho, String ten, boolean gioiTinh, String email,
			String soDienThoai, String tenDangNhap, String matKhau, Set<DiaChi> dsDiaChi) {
		super(username, password, authorities);
		this.id = id;
		this.ngayTao = ngayTao;
		this.loainguoidung = loainguoidung;
		this.ho = ho;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.dsDiaChi = dsDiaChi;
	}
	
}
