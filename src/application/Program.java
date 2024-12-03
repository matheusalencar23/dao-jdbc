package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {	
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST #1: Seller - findById === ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST #2: Seller - findByDepartment === ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDeparment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST #3: Seller - findAll === ");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST #1: Department - findById === ");
		department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST #2: Department - findAll === ");
		List<Department> listDepartment = departmentDao.findAll();
		for (Department departmentItem : listDepartment) {
			System.out.println(departmentItem);			
		}

	}

}
