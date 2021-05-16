package com.websitedungcuthethao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class AnhSanPham{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String anh;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanphamID", nullable = false)
	private SanPham sanpham;
	
}
