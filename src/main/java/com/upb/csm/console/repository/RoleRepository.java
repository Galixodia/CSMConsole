package com.upb.csm.console.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upb.csm.console.entity.CSMRole;

@Repository
public interface RoleRepository extends CrudRepository<CSMRole, Long>{

	public CSMRole findByName(String role);
}
