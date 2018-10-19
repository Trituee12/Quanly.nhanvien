package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.Nhanvien;
import Model.NhanvienModel;

public class loginService {
	@Autowired
	NhanvienModel nvmodel;
	public Nhanvien loginNV(String email, String password){
		return nvmodel.loginNV(email, password);
	}
}
