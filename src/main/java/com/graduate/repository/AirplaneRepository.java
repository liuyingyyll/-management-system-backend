package com.graduate.repository;

import com.graduate.entity.Airplane;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {

}
