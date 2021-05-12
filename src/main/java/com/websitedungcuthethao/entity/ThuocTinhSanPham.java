package com.websitedungcuthethao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class ThuocTinhSanPham extends BaseEntity{
	
	
	@NonNull
	private String tenThuoctinh;
	
	@OneToMany(mappedBy = "thuoctinhsanpham")
	private List<GiaTriThuocTinhSanPham> dsGiaTriThuocTinh = new ArrayList<GiaTriThuocTinhSanPham>();
	
}
