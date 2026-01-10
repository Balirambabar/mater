package com.FrontOffice.repo;

import com.FrontOffice.entity.UserDtsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDtlsRepo extends JpaRepository<UserDtsEntity, Integer> {
    public UserDtsEntity findByUserEmail(String email);

    public UserDtsEntity findByUserNameAndUserPassword(String name, String password);
}

