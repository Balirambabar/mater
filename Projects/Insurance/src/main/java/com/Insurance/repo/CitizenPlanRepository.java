package com.Insurance.repo;

import com.Insurance.entity.CitizenPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {

    @Query("select distinct c.planName from CitizenPlan c")
    public List<String> getPlanName();

    @Query("select distinct c.planStatus from CitizenPlan c")
    public List<String> getPlanStatus();




}
