package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ComplaintsEntity;

public interface ComplaintsRepository extends JpaRepository<ComplaintsEntity, Integer> {

}
