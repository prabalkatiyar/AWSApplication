package com.aws.awsApplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.awsApplication.Entity.User;

@Repository
public interface DaoInterface extends JpaRepository<User, Integer>{

}
