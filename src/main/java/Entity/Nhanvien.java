package Entity;
// Generated Oct 19, 2018 5:20:48 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name = "nhanvien", catalog = "quanlythanhtichabc")
public class Nhanvien implements java.io.Serializable {

	private String manv;
	private Phongban phongban;
	private String hoten;
	private String gioitinh;
	private Date ngaysinh;
	private Integer luong;
	private Integer capdo;
	private String email;
	private String dienthoai;
	private String password;
	private String loaitk;
	private String tenhinh;
	private Date thoigianthem;
	private Set<Thanhtichkyluat> thanhtichkyluats = new HashSet<Thanhtichkyluat>(0);

	public Nhanvien() {
	}

	public Nhanvien(String manv, Date thoigianthem) {
		this.manv = manv;
		this.thoigianthem = thoigianthem;
	}

	public Nhanvien(String manv, Phongban phongban, String hoten, String gioitinh, Date ngaysinh, Integer luong,
			Integer capdo, String email, String dienthoai, String password, String loaitk, String tenhinh,
			Date thoigianthem, Set<Thanhtichkyluat> thanhtichkyluats) {
		this.manv = manv;
		this.phongban = phongban;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.luong = luong;
		this.capdo = capdo;
		this.email = email;
		this.dienthoai = dienthoai;
		this.password = password;
		this.loaitk = loaitk;
		this.tenhinh = tenhinh;
		this.thoigianthem = thoigianthem;
		this.thanhtichkyluats = thanhtichkyluats;
	}

	@Id

	@Column(name = "manv", unique = true, nullable = false, length = 5)
	public String getManv() {
		return this.manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maphongban")
	public Phongban getPhongban() {
		return this.phongban;
	}

	public void setPhongban(Phongban phongban) {
		this.phongban = phongban;
	}

	@Column(name = "hoten", length = 500)
	public String getHoten() {
		return this.hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	@Column(name = "gioitinh", length = 4)
	public String getGioitinh() {
		return this.gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ngaysinh", length = 10)
	public Date getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	@Column(name = "luong")
	public Integer getLuong() {
		return this.luong;
	}

	public void setLuong(Integer luong) {
		this.luong = luong;
	}

	@Column(name = "capdo")
	public Integer getCapdo() {
		return this.capdo;
	}

	public void setCapdo(Integer capdo) {
		this.capdo = capdo;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "dienthoai", length = 11)
	public String getDienthoai() {
		return this.dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "loaitk", length = 2)
	public String getLoaitk() {
		return this.loaitk;
	}

	public void setLoaitk(String loaitk) {
		this.loaitk = loaitk;
	}

	@Column(name = "tenhinh", length = 200)
	public String getTenhinh() {
		return this.tenhinh;
	}

	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "thoigianthem", nullable = false, length = 19)
	public Date getThoigianthem() {
		return this.thoigianthem;
	}

	public void setThoigianthem(Date thoigianthem) {
		this.thoigianthem = thoigianthem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Thanhtichkyluat> getThanhtichkyluats() {
		return this.thanhtichkyluats;
	}

	public void setThanhtichkyluats(Set<Thanhtichkyluat> thanhtichkyluats) {
		this.thanhtichkyluats = thanhtichkyluats;
	}

}
