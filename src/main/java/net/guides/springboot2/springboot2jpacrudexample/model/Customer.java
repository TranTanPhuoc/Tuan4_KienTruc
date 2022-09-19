package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class Customer {
	@Id
	private String maNV;
	private String ten;
	private int luong; 
	private String id;
	
	@Id
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String maNV, String ten, int luong, String id) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + ", id=" + id + "]";
	}
	
}
