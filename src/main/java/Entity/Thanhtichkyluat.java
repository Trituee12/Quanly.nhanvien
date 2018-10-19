package Entity;
// Generated Oct 19, 2018 5:20:48 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Thanhtichkyluat generated by hbm2java
 */
@Entity
@Table(name = "thanhtichkyluat", catalog = "quanlythanhtichabc")
public class Thanhtichkyluat implements java.io.Serializable {

	private Integer matt;
	private Nhanvien nhanvien;
	private Phongban phongban;
	private Integer loai;
	private String lydo;
	private Date ngayghinhan;

	public Thanhtichkyluat() {
	}

	public Thanhtichkyluat(Date ngayghinhan) {
		this.ngayghinhan = ngayghinhan;
	}

	public Thanhtichkyluat(Nhanvien nhanvien, Phongban phongban, Integer loai, String lydo, Date ngayghinhan) {
		this.nhanvien = nhanvien;
		this.phongban = phongban;
		this.loai = loai;
		this.lydo = lydo;
		this.ngayghinhan = ngayghinhan;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "matt", unique = true, nullable = false)
	public Integer getMatt() {
		return this.matt;
	}

	public void setMatt(Integer matt) {
		this.matt = matt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manhanvien")
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maphongb")
	public Phongban getPhongban() {
		return this.phongban;
	}

	public void setPhongban(Phongban phongban) {
		this.phongban = phongban;
	}

	@Column(name = "loai")
	public Integer getLoai() {
		return this.loai;
	}

	public void setLoai(Integer loai) {
		this.loai = loai;
	}

	@Column(name = "lydo", length = 10)
	public String getLydo() {
		return this.lydo;
	}

	public void setLydo(String lydo) {
		this.lydo = lydo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngayghinhan", nullable = false, length = 19)
	public Date getNgayghinhan() {
		return this.ngayghinhan;
	}

	public void setNgayghinhan(Date ngayghinhan) {
		this.ngayghinhan = ngayghinhan;
	}

}