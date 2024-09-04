package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Book");
		
		Seller seller = new Seller(1, "Lucas", "lucas@gmail", new Date(), 1000.00, dep);
		
		System.out.println(seller);

	}

}
