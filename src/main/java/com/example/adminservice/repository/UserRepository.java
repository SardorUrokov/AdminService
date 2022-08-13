package com.example.adminservice.repository;

import com.example.adminservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * project: AdminService
 * author: Sardor Urokov
 * created at 1:10 AM on 13/Aug/2022
 **/
public interface UserRepository extends JpaRepository<User, Long>{

}
