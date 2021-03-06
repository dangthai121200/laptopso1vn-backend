package app.netlify.laptopso1vn.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "AdminEntity")
@Table(name = "admin")
public class AdminEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maad")
	private String maad;
	
	@Column(name = "ho")
	private String ho;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "sdt")
	private String sdt;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	public AdminEntity() {
	}

	public AdminEntity(String maad, String ho, String ten, String diachi, String sdt, String email, String username,
			String password) {
		super();
		this.maad = maad;
		this.ho = ho;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	

	public AdminEntity(String ho, String ten, String diachi, String sdt, String email, String username,
			String password) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.username = username;
		this.password = password;
	}



	public String getMaad() {
		return maad;
	}

	public void setMaad(String maad) {
		this.maad = maad;
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

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
