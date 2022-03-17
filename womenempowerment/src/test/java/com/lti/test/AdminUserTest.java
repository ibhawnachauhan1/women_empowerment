package com.lti.test;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.entity.Admin;
import com.lti.entity.User;

public class AdminUserTest {

	@Test
	public void addadmin() {
		Admin admin=new Admin();
		admin.setUsername("sang");
		admin.setPassword("12345");
		admin.setMobileno(12345);
		
		GenericDao dao=new GenericDao();
		dao.save(admin);
		
	}
	@Test
	public void adduser() {
		GenericDao dao=new GenericDao();
		Admin admin=(Admin) dao.fetchById(Admin.class, 13);
		
		User user=new User();
		user.setFirstname("sangi");
		user.setLastName("maha");
		user.setAge(23);
		user.setMobileno(2345);
		user.setFathername("Mohan");
		user.setFatheroccupation("buss");
		user.setFatherage(45);
		user.setFathermobileno(3456);
		user.setAddress("srd");
		user.setQualification("Btech");
		user.setAdmin(admin);
		dao.save(user);
	}
}
