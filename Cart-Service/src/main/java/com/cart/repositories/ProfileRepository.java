package com.cart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cart.model.Profile;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, String> {

}
