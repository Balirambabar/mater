package com.FrontOffice.repo;


import com.FrontOffice.entity.CustomerEnqEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustEnqRepo extends JpaRepository<CustomerEnqEntity, Integer> {

}
