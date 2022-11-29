package com.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BankRepo extends CrudRepository<Bank, String> {

}
