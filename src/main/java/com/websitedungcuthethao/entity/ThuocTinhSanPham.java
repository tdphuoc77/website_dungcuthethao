package com.websitedungcuthethao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class ThuocTinhSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private String tenThuoctinh;
	
	@OneToMany(mappedBy = "thuoctinhsanpham")
	private List<GiaTriThuocTinhSanPham> dsGiaTriThuocTinh = new ArrayList<GiaTriThuocTinhSanPham>();
	
}
