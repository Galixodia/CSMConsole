package com.upb.csm.console.service;


import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.upb.csm.console.Exception.UsernameOrIdNotFound;
import com.upb.csm.console.dto.ChangePasswordForm;
import com.upb.csm.console.entity.CSMUser;


public interface UserService {

	public Iterable<CSMUser> getAllUsers();

	public CSMUser createUser(CSMUser user) throws Exception;

	public CSMUser getUserById(Long id) throws Exception;
	
	public CSMUser updateUser(CSMUser user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public CSMUser changePassword(ChangePasswordForm form) throws Exception;
}
