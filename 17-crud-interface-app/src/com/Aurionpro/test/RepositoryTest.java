package com.Aurionpro.test;

import com.Aurionpro.model.CustomerRepository;
import com.Aurionpro.model.IRepository;
import com.Aurionpro.model.OrderRepository;
import com.Aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
       IRepository customer=new CustomerRepository();
       repositoryCrud(customer);
       
       IRepository order=new OrderRepository();
       repositoryCrud(order);
       
       IRepository product=new ProductRepository();
       repositoryCrud(product);
	}

	private static void repositoryCrud(IRepository repository) {
		repository.create();
		repository.delete();
		repository.read();
		repository.update();
		repository.write();
		System.out.println("----------------------------------");
		
		
	}

}
