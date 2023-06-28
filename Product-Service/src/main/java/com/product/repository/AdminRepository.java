package com.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Admin;



@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {

	Admin findByUsernameAndPassword(String username, String password);



//	List<Product> findByCatagory(String catagory);
//
//	Optional<Product> findByName(String name);
//

	

}