package com.sp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sp.entity.MatutalFund;

@Repository
public interface MataulFundRepository extends  JpaRepository<MatutalFund, Integer>{
	
	@Query(value="select * from MutualFundsss where own=:own" ,nativeQuery=true)
	public MatutalFund getbyown(@Param("own")String own_by);
	
	List<MatutalFund> findByNumGreaterThan(int num);

}
