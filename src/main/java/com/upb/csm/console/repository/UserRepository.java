package com.upb.csm.console.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upb.csm.console.entity.CSMUser;


@Repository
public interface UserRepository extends CrudRepository<CSMUser, Long> {

	public Optional<CSMUser> findByUsername(String username);
 }
