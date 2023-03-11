package com.xworkz.user.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.user.dto.LoginDTO;

public interface LoginServices {
	Set<ConstraintViolation<LoginDTO>> validateAndSave(LoginDTO serviceDTO);
	Set<ConstraintViolation<LoginDTO>> user(LoginDTO loginDto);
	Set<ConstraintViolation<LoginDTO>> pwd(LoginDTO loginDto);

}
