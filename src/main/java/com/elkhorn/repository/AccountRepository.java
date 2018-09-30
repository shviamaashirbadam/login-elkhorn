package com.elkhorn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elkhorn.beans.Account;

@Repository
public interface AccountRepository extends JpaRepository <Account, Integer> {
	

		public Account findByusername(String username);
	
	
	
	
	

}
