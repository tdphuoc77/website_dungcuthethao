package com.websitedungcuthethao.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.ToString;

@Embeddable
@Data
@ToString
public class GiaTriThuocTinhSanPham_PK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long sanpham;
	private Long thuoctinhsanpham;
	
}
