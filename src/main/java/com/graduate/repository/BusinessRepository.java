package com.graduate.repository;

import com.graduate.entity.Business;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BusinessRepository extends CrudRepository<Business, Integer> {

}
