package com.cg.creditcardpayment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcardpayment.entity.AccountEntity;

/**
 * 
 * @author Himavanth
 *
 */

@Repository
public interface IAccountRepository extends JpaRepository<AccountEntity, String>{


	
}
