package com.websitedungcuthethao.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChiTietHoaDon_PK implements Serializable {
	private int sanpham;
	private int hoadon;
}
