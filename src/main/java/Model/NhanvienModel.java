package Model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Entity.Nhanvien;
import UtilHibernate.HibernateUtil;

public class NhanvienModel {
	public Nhanvien loginNV(String email, String password) {
		Session ss = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = ss.beginTransaction();
		Query q = ss.createQuery("from Nhanvien where email =:email and password =:password and loaitk = 'AD'");
		q.setString("email", email);
		q.setString("password", password);
		Nhanvien nv = (Nhanvien) q.uniqueResult();
		ts.commit();
		return nv;
	}
}
