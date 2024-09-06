package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmenDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department findById ===");
		Department dep = departmenDao.findbyId(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: Department insert ===");
		dep = new Department(null, "D3");
		departmenDao.insert(dep);
		System.out.println("Inserted! new id = " + dep.getId());

		System.out.println("\n=== TEST 3: Department  update ===");
		dep = departmenDao.findbyId(7);
		dep.setName("D4");
		departmenDao.update(dep);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 4: Department findAll ===");
		List<Department> list = departmenDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 5: Department delete ===");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		departmenDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();

	}

}
