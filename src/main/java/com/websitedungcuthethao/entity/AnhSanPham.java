package com.websitedungcuthethao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class AnhSanPham  extends BaseEntity{
	private String anh;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanphamID", nullable = false)
	private SanPham sanpham;
	
}
